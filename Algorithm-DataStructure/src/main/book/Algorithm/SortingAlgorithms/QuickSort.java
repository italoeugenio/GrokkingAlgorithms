package main.book.Algorithm.SortingAlgorithms;

public class QuickSort {
   public static int somarArraysRecursao(int[] arr, int tamanho){
       if(tamanho == 0){
           return 0;
       }

       return arr[tamanho - 1] + somarArraysRecursao(arr, tamanho - 1);
   }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(somarArraysRecursao(arr, arr.length));
    }
}
