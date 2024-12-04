package main.SelectionSort;

public class SelectionSort {

    public static void selectionSort(int[] list){
        int n = list.length - 1;

        for(int i = 0; i < n;i++){
            int min_inx = 1;

            for(int j = i + 1; j < n; j++){
                if(list[j] < list[min_inx]){
                    min_inx = j;
                }
            }
            int temp = list[i];
            list[i] = list[min_idx];
            list[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
    }
}
