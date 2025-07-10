package main.book.Algorithm.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static int findMinIndex(int arr[], int startIndex){
        int min = arr[startIndex];
        int minIndex = startIndex;

        for(int i = startIndex + 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = findMinIndex(arr, i);
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }


    public static int[] selectionSort2(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 0};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(selectionSort2(arr)));
    }
}
