package random;

import java.util.Random;

public class Demo01_random {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        System.out.println("随机数字为: " + num);
    }
}
