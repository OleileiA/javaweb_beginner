package demo02_scanner;

import java.util.Scanner;

/**
 * 求三个数字的最大值
 */
public class Demo03_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = num1 > num2 ? num1 : num2 > num3 ? num2 : num3;
        System.out.println("最大的值为" + max);
    }
}
