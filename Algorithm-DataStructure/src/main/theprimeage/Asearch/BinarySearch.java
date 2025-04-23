package main.theprimeage.Asearch;

public class BinarySearch {
    public static Integer binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 9, 10};
        System.out.println(binarySearch(arr, 2));
    }
}
