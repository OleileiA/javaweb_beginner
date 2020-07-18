package demo01_scanner;

import java.util.Scanner;

public class Demo01_scanner {

    public static void main(String[] args) {
        // System.in 表示从键盘输入
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("输入的键盘数字为" + num);
    }
}
