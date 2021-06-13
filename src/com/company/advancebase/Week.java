package com.company.advancebase;

/**
 * Created by Anjude
 * Date: 2021/5/4 23:00
 */
public enum Week {
    //本文的枚举类变量，枚举类实例，name属性指的就是MONDAY
    //这类的变量
    MONDAY(0, "星期一"),
    TUESDAY(1, "星期二"),
    WEDNESDAY(2, "星期三"),
    THURSDAY(3, "星期四"),
    FRIDAY(4, "星期五"),
    SATURDAY(5, "星期六"),
    //最后一个类型必须要用分号结束
    SUNDAY(6, "星期日");

    private int num;
    private String desc;

    /**
     * 构造方法必然是private修饰的
     * 就算不写，也是默认的
     *
     * @param num
     * @param desc
     */
    private Week(int num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Week.SATURDAY.num);
        System.out.println(Week.SATURDAY.desc);
        System.out.println(Week.SATURDAY.getDesc());
    }
}