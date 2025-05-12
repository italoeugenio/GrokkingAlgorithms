package main.theprimeage.Asearch.sort;

import java.util.Arrays;

public class BubbleSort {
    public static Integer[] bubbleSort(Integer[] arr){
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = 1 + i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                   minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,1,5,7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
