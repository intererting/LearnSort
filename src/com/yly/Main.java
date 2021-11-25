package com.yly;

import java.util.Random;

/**
 * 时间统计
 * 冒泡排序 慢
 * 插入排序 慢
 * 归并排序 250ms
 * 快速排序 200ms
 * 希尔排序 350ms
 * 堆排序 250ms
 */
public class Main {

    private final static int NUM = 1_000_000;

    public static void main(String[] args) {
//        testMergeSort();
//        testInsertSort();
//        testBubbleSort();
        testQuickSort();
//        testShellSort();
//        testHeapSort();
    }

    private static void testHeapSort() {
        long start = System.currentTimeMillis();
        int[] randomData = new int[NUM];
        for (int i = 0; i < randomData.length; i++) {
            randomData[i] = new Random().nextInt(randomData.length);
        }
        HeapSort.sort(randomData);
        for (int i = 0; i < randomData.length - 1; i++) {
            if (randomData[i] > randomData[i + 1]) {
                System.out.println("error");
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void testShellSort() {
        long start = System.currentTimeMillis();
        int[] randomData = new int[NUM];
        for (int i = 0; i < randomData.length; i++) {
            randomData[i] = new Random().nextInt(randomData.length);
        }
        ShellSort.sort(randomData);
        for (int i = 0; i < randomData.length - 1; i++) {
            if (randomData[i] > randomData[i + 1]) {
                System.out.println("error");
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void testQuickSort() {
        long start = System.currentTimeMillis();
        int[] randomData = new int[NUM];
        for (int i = 0; i < randomData.length; i++) {
            randomData[i] = new Random().nextInt(randomData.length);
        }
        QuickSort.sort(randomData);
        for (int i = 0; i < randomData.length - 1; i++) {
            if (randomData[i] > randomData[i + 1]) {
                System.out.println("error");
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void testBubbleSort() {
        int[] randomData = new int[10000];
        for (int i = 0; i < randomData.length; i++) {
            randomData[i] = new Random().nextInt(randomData.length);
        }
        BubbleSort.sort(randomData);
        for (int i = 0; i < randomData.length - 1; i++) {
            if (randomData[i] > randomData[i + 1]) {
                System.out.println("error");
                break;
            }
        }
    }

    private static void testInsertSort() {
        int[] randomData = new int[NUM];
        for (int i = 0; i < randomData.length; i++) {
            randomData[i] = new Random().nextInt(randomData.length);
        }
        InsertSort.sort(randomData);
        for (int i = 0; i < randomData.length - 1; i++) {
            if (randomData[i] > randomData[i + 1]) {
                System.out.println("error");
                break;
            }
        }
    }

    /**
     * 归并排序+败者树
     */
    private static void testMergeSort() {
        long start = System.currentTimeMillis();
        int[] randomData = new int[NUM];
        for (int i = 0; i < randomData.length; i++) {
            randomData[i] = new Random().nextInt(randomData.length);
        }
        MergeSort.sort(randomData);
        for (int i = 0; i < randomData.length - 1; i++) {
            if (randomData[i] > randomData[i + 1]) {
                System.out.println("error");
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
