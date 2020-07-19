package InnerClass;

public class AnonymousInnerClass {

    /*
    * 如果一个接口的实现类只使用唯一一次，那么可以直接使用匿名内部类
    * */

    // 正常用法，使用一个单独的实现类
    InterfaceAnomous ia = new InterfaceAnomousImpl();

    // 使用匿名实现类的用法
    InterfaceAnomous interfaceAnomous = new InterfaceAnomous() {};
}
