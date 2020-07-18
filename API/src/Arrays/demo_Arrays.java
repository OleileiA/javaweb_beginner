package Arrays;

import java.util.Arrays;

public class demo_Arrays {
    /**
     * Arrays 工具类的用法
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Arrays.toString();
         * 将数组展示出来
         */
        int[] arr = { 1, 2, 3 };
        System.out.println(Arrays.toString(arr));

        /**
         * Arrays.sort
         * 排序函数
         * 1. 如果是数字，直接排序
         * 2. 字母也是按照升序排序
         * 3. 自定义类型的元素要实现Comparable或者Comparator接口
         */
        Arrays.sort(arr);
    }
}
