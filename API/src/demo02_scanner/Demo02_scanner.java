package demo02_scanner;

import java.util.Scanner;

/**
 * 求两个数字的和
  */
public class Demo02_scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("sum = " + (num1 + num2));
    }
}
