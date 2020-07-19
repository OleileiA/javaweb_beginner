package Interface;

/**
 * 接口就是多个类的公共规范
 * java7中可以包含：常量和抽象方法
 * java8中可以更多的增加：默认方法和静态方法
 * java9可以更多的增加：私有方法
 *
 */
public interface Interface01 {

    // 接口中的抽象方法必须是这两个关键字：public abstract（可以省略）
    public abstract void func();

    // 定义默认方法
    // 因为默认方法不强制要求实现类实现，所以常用于借口的升级，而不影响实现类
    // 要注意默认方法也是可以被重写的
    public default void defaultFunction() {
        System.out.println("这是一个默认方法");
    }

    // 定义静态方法
    // 通过接口名称直接调用静态方法
    public static void staticFunction() {
        System.out.println("这是一个静态方法");
    }

    // 仅供接口之内自用的私有方法（java9）：
//    private void privateFunction() {
//        System.out.println("这是一个私有方法");
//    }

    // 1. 接口中的成员变量必须是 public static final
    // 2. 必须复制
    // 3. 命名方式使用大写字母加下划线
    public static final String SHORT_STRING = "abc";
}
