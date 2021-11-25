package com.yly;

import java.util.Arrays;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/11/25 上午10:13
 * @since 1.0
 */
public class QuickSort {

    public static void sort(int[] arr) {
        int length = arr.length;
        quickSort(arr, 0, length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        dealPivot(arr, start, end);
        //中间值放在end-1的位置
        int pivot = end - 1;
        //左右指针
        int left = start;
        int right = pivot;
        //左右指针遍历,left的都比pivot要小,right要比pivot都大
        while (true) {
            while (arr[++left] < arr[pivot]) {
                //left指向比pivot大的位置
            }
            while (right > left && arr[--right] > arr[pivot]) {
                //right > left是为了防止只有两个数的情况,这时候right=0
                //left指向比pivot小的位置
            }
            if (left < right) {
                //这个时候left发现了比pivot大值,right发现了比pivot小值
                //交换
                swap(arr, left, right);
            } else {
                //这个时候已经保证了pivot左边比他小,pivot右边比他大
                break;
            }
        }
        //left>=right,交换pivot和left的位置
        if (left < pivot) {
            swap(arr, left, pivot);
        }
        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }

    /**
     * 找到中间值,这个值可以取第一个,也可以取0,mid,end的中间值,然后放到,end-1的位置
     * 当left,right两个指针遍历完成以后,只需要将end-1和right指针交换即可
     */
    public static void dealPivot(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[left] > arr[mid]) {
            swap(arr, left, mid);
        }
        if (arr[left] > arr[right]) {
            swap(arr, left, right);
        }
        if (arr[right] < arr[mid]) {
            swap(arr, right, mid);
        }
        swap(arr, right - 1, mid);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
