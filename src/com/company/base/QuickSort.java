package com.company.base;

// 快速排序的操作是这样的：
// 设置左一为基准值
// 首先从数列的右边开始往左边找，我们设这个下标为 i，也就是进行减减操作（i--）
// 找到第 1 个比基准数小的值，让它与基准值交换；
// 接着从左边开始往右边找，设这个下标为 j，然后执行加加操作（j++）
// 找到第 1 个比基准数大的值，让它与基准值交换；
// 然后继续寻找，直到 i 与 j 相遇时结束
// 最后基准值所在的位置即 k 的位置
// 也就是说 k 左边的值均比 k 上的值小，而 k 右边的值都比 k 上的值大。

import java.util.Arrays;

public class QuickSort {

    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
        quickSort(array, 0, array.length - 1);
    }

    /**
     * 递归排序
     */
    private void quickSort(int[] arr, int begin, int end) {
        System.out.println(Arrays.toString(array));
        if (begin < end) {
            int key = arr[begin];
            int i = begin;
            int j = end;
            // 在需要排序的子序列中遍历 [begin, end]，当i>=j，当前子序列遍历已完成
            while (i < j) {
                // 从右边开始找到第一个小于基准值的下标（第一次这个数是5）
                while (i < j && arr[j] > key) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    arr[j] = key;
                    i++;
                }
                // 从左边开始找到第一个大于基准值的下标（第一次这个数是7）
                while (i < j && arr[i] < key) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    arr[i] = key;
                    j--;
                }
            }
            arr[i] = key;
            // 分别对基准值左右部分递归排序（此时i为基准值的下标）
            quickSort(arr, begin, i - 1);
            quickSort(arr, i + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 4, 7, 9, 1, 3, 8, 5};
        QuickSort quickSort = new QuickSort(array);

    }
}
