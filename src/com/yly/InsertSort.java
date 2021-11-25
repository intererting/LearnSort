package com.yly;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/11/24 下午5:13
 * @since 1.0
 */
public class InsertSort {
    public static void sort(int[] arr) {
        long start = System.currentTimeMillis();
        int j;
        int length = arr.length - 1;
        //从后往前找到比自己大的元素,然后往后移动,否则插入比自己小的位置
        for (int i = 1; i <= length; i++) {
            int temp = arr[i];
            for (j = i; j > 0 && temp < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
