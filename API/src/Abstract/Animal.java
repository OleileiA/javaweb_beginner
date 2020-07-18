package Abstract;

/*
* 抽象类的四个注意事项：
* 1. 不能实现实例
* 2. 抽象类可以由构造方法，提供给子类使用，初始化父类成员。
* 3. 抽象类不一定有抽象方法，有抽象方法一定是抽象类。
* 4. 抽象类的子类一定要实现父类的所有抽象方法
* */
public abstract class Animal {

    // 抽象类中也可以有具体方法
    public String getClassName() {
        return "Animal";
    }

    // 抽象类的抽象行为
    public abstract String eat();
}
