package com.yly;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/11/25 上午9:17
 * @since 1.0
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        long start = System.currentTimeMillis();
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
