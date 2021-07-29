package test;

import com.company.base.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ReflectDemo  反射获取类
 *
 * @author Anjude
 * @date 2021/7/30 0:37
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // way 1
        Class c1 = Class.forName("com.company.base.Test");

        // way 2
        Test test = new Test();
        Class c2 = test.getClass();

        // way 3
        Class c3 = Test.class;

        // way 4: 对于内置类型的包装类，可以通过 TYPE 反射
        Class c4 = Integer.TYPE;

        // way 5：获取父类
        Class c5 = c1.getSuperclass();

        // 通过无参构造器创建对象
        Test t1 = (Test) c1.newInstance();

        // 通过获取对应构造器初始化
        Constructor c = c1.getDeclaredConstructor(String.class);
        Test t2 = (Test) c.newInstance("111");

        Method setName = c1.getDeclaredMethod("setName");
        setName.invoke(t2, "args");
        t2.getName();

        Field name = c1.getDeclaredField("name");
        // 破坏私有属性
        name.setAccessible(true);
        name.set(t2, "lisi");
        t2.getName();

    }
}
