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


    public static void main(String[] args) {
        Integer[] arr = {10,2,1,5,7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
