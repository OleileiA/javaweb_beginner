package Polymorphic;

public class Polymorphic {
    public static void main(String[] args) {
        // 子类对象指向父类引用，就是多态
        Father father = new Son();

        // 访问实例的方法，而不是引用的
        System.out.println(father.getName());

        // 访问引用的成员变量（成员变量不具有多态）
        // Father编译时类型
        // Son运行时类型
        // father.NAME输出的是编译时类型定义的成员变量，所以输出Father
        System.out.println(father.NAME);
    }
}
