package com.charl.sort;

import java.util.Arrays;

/**
 * Create by charl
 * Date 2020/7/22 10:51
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,4,1,2,8,6,9,0};
        Arrays.stream(arr).forEach(v -> System.out.print(v+","));
        System.out.println();
        sort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(v -> System.out.print(v+","));
    }

    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int temp = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && arr[j] > temp) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && arr[i] < temp) {
                i++;
            }
            if(i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = temp;
        sort(arr, left, i - 1);
        sort(arr, i + 1, right);
    }
}
