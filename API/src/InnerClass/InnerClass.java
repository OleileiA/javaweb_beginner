package InnerClass;

public class InnerClass {
    /**
     * 如果一个事务包含另外一个事务，一般使用内部类
     */

    private String outer = "outer";

    private int num = 20;
    // 内部类
    public class Node {
        private int num = 10;
        public String getOuter() {
            // 内部类可以直接访问外部类的任何方法和属性
            // 外部类想要使用内部类成员和方法需要内部的实例
            return outer;
        }
        public int returnNum() {
            System.out.println(num);
            System.out.println(InnerClass.this.num); // 调用重名的外部类成员变量
            return 0;
        }
    }
}
