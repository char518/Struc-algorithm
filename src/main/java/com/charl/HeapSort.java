package com.charl;

/**
 * 堆排序
 */
public class HeapSort {

    public static void main(String[] args) {


    }

    public void buildHeap(int[] arr, int index, int len) {
        int leftIndex = 2 * index + 1;
        int temp = arr[index];
        while (leftIndex < len) {
            int rightIndex = 2 * index + 2;
            if (rightIndex < len && arr[leftIndex] < arr[rightIndex]) {
                leftIndex = rightIndex;
            }
            if (arr[index] > arr[leftIndex]) {
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
