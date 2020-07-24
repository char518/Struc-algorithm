package com.charl;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int i = sc.nextInt();
//        }
        int[] arr = {2,1,8,5,9,3};
        int length = arr.length;

        Arrays.stream(arr).forEach(v -> System.out.print(v));
        System.out.println();
        for (int i = length / 2 - 1; i >= 0; i--) {
            buildHeap(arr, i, length);
        }
        Arrays.stream(arr).forEach(v -> System.out.print(v));
        System.out.println();
        int temp = 0;
        for (int i = length -1; i > 0; i--) {
            temp = arr[i ];
            arr[i] = arr[0];
            arr[0] = temp;
            buildHeap(arr, 0, i);
        }
        Arrays.stream(arr).forEach(v -> System.out.print(v));
        System.out.println();

    }

    public static void buildHeap(int[] arr, int index, int len) {
        int leftIndex = 2 * index + 1;
        int temp = arr[index];
        while (leftIndex < len) {
            int rightIndex = 2 * index + 2;
            if (rightIndex < len && arr[leftIndex] < arr[rightIndex]) {
                leftIndex = rightIndex;
            }
            if (temp > arr[leftIndex]) {
                break;
            }
            arr[index] = arr[leftIndex];
            index = leftIndex;
            leftIndex = 2 * index + 1;
        }
        if (temp != arr[index]) {
            arr[index] = temp;
        }
    }

}
