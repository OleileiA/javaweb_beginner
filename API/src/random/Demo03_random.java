package random;

import java.util.Random;

public class Demo03_random {
    /**
     * 获取1-n的随机数组
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10) + 1; // 1 ~ 10
        System.out.println(num);
    }
}
