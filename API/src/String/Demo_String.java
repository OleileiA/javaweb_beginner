package String;

public class Demo_String {

    public static void main(String[] args) {
        /*
        * 字符串的特点：
        * 1. 字符串是常量，永不可变。
        * 2. 某些情况下可以共用。
        * 3. 字符串效果上相当于char数组，本质上是byte数组。
        *  */


        /*
        * 3种构造方法 + 直接量
        *  */
        String s1 = new String();
        String s2 = new String(new char[] {'a', 'b', 'c'});
        String s3 = new String(new byte[] { 97, 98, 99 });
        String s4 = "abc";



        /*
        * 常量池 (在堆内存中有一个块常量池内存) :
        * 1. 字面量会被存入常量池
        * 2. 基本类型包装类值为-128~127的存入常量池
        * 3. string.intern()会存入常量池。
        * */
        String ss1 = "abc";
        String ss2 = "abc";
        String ss3 = new String(new char[] {'a', 'b', 'c'});

        System.out.println(ss1 == ss2); // 利用常量池存储的同一个字符串，直接复用
        System.out.println(ss1 == ss3);
        System.out.println(ss2 == ss3);


        /*
        * 字符串内容比较：使用equals
        *  */
        System.out.println("asd".equals("asd"));
        String sss1 = "abc";
        String sss2 = null;

        sss2.equals("abc"); // 不建议这种使用方法，因为sss2有可能为空，导致空指针异常
        "abc".equals(sss1); // 建议这种使用方法

    }
}
