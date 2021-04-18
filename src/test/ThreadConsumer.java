package test;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */

/**
 * Created by Anjude
 * Date: 2021/4/7 23:42
 */
public class ThreadConsumer extends Thread {
    private String mFileName;
    private FileChannel mFileChannel;
    private MappedByteBuffer mMappedByteBuffer;

    public ThreadConsumer(String fn) {
        try {
            mFileName = fn;

            // 获得一个可读写的随机存取文件对象
            RandomAccessFile RAFile = new RandomAccessFile(mFileName, "r");

            // 获得相应的文件通道
            mFileChannel = RAFile.getChannel();

            // 取得文件的实际大小，以便映像到共享内存
            int size = (int) mFileChannel.size();

            // 获得共享内存缓冲区，该共享内存可读
            mMappedByteBuffer = mFileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size).load();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(300);
                FileLock lock = null;
                lock = mFileChannel.tryLock(0, 10, true);
                if (lock == null) {
                    System.err.println("Consumer: lock failed");
                    continue;
                }
                Thread.sleep(200);
                System.out.println("Consumer: " + mMappedByteBuffer.getInt(0) + ":" + mMappedByteBuffer.getInt(4) + ":" + mMappedByteBuffer.getInt(8));
                lock.release();
            } catch (IOException ex) {
                System.out.print(ex);
            } catch (InterruptedException ex) {
                System.out.print(ex);
            }
        }
    }

    public static void main(String args[]) {
        ThreadConsumer consumer = new ThreadConsumer("sharedMemory.bin");
        consumer.start();
    }
}