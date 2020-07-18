package random;

import java.util.Random;

public class Demo02_random {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // 0 - 9
            System.out.println(random.nextInt(10));
        }
    }
}
