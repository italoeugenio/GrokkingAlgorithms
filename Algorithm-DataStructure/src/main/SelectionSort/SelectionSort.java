package main.SelectionSort;

public class SelectionSort {

    public static void selectionSort(int[] list){
        int n = list.length - 1;

        for(int i = 0; i < n;i++){
            int min_inx = i;

            for(int j = i + 1; j < n; j++){
                if(list[j] < list[min_inx]){
                    min_inx = j;
                }

            }
            int temp = list[i];
            list[i] = list[min_inx];
            list[min_inx] = temp;
        }
    }

   public static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,1,4,5,2};

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
        }
}

