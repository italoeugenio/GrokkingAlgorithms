package main.theprimeage.Asearch;

public class LinearSearch {
    public static Integer findElement(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(findElement(arr,3));
    }
}
