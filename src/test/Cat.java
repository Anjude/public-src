package test;

/**
 * Created by Anjude
 * Date: 2021/4/2 0:25
 */
public class Cat extends Animal {
    private String gender;
    private int age;

    public Cat() {
        System.out.println("no super");
    }

    public Cat(int age) {
        super(age);
        this.age = age;
    }

    public Cat(int age, String gender) {
        super(age);
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String hello(){
        return "我是猫";
    }

    @Override
    public int getAge() {
        return age + 1;
    }

    public String getGender() {
        return gender;
    }

    public String miao() {
        return "miao";
    }
}
