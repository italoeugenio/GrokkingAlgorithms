package main.theprimeage.Asearch.sort;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 5, 7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
