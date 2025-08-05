package main.exercice;

public class NumberAllLines {
    public static void findNumbersInAllLine(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {7, 3, 9, 5, 2, 1},
                {4, 1, 6, 8, 0, 3},
                {1, 2, 7, 9, 4, 5},
                {6, 1, 8, 0, 3, 2}
        };

        findNumbersInAllLine(arr);
    }
}
