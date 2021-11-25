package com.yly;

import java.util.Arrays;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/11/24 下午3:59
 * @since 1.0
 */
public class MergeSort {

    public static void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private static void sort(int[] data, int start, int end) {
        if (start < end) {
            int mid = start + ((end - start) >>> 1);
            sort(data, start, mid);
            sort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    private static void merge(int[] data, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int index = 0;
        int[] temp = new int[end - start + 1];
        while (left <= mid && right <= end) {
            if (data[left] <= data[right]) {
                temp[index++] = data[left++];
            } else {
                temp[index++] = data[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = data[left++];
        }
        while (right <= end) {
            temp[index++] = data[right++];
        }
        System.arraycopy(temp, 0, data, start, temp.length);
    }
}











