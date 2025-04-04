package main.book.DataStructure.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        //One-dimensional Arrays
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];

        System.out.print("One-dimensional Arrays (for-each): ");
        for(int numbers1 : arr1){
            System.out.println(numbers1);
        }

        System.out.print("One-dimensional Arrays (for): ");
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        //Multidimensional Arrays
        int[][] arrMulti1 = {{1,2,3},
                             {4,5,6},
                             {7,8,9}
        };

        int[][] arrMulti2 = new int[3][3];

        System.out.print("Multidimensional Arrays (for-each): ");
        for(int[] line: arrMulti1){
            for(int element: line){
                System.out.println(element);
            }
        }

        System.out.print("Multidimensional Arrays (for-each): ");
        for(int i = 0; i < arrMulti1.length; i++){
            for (int j = 0; j < arrMulti1[i].length; j++){
                System.out.println(arrMulti1[i][j]);
            }
        }

        //Dynamic Arrays
        List<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);

        System.out.println("Dynamic Array (for-each): ");
        for (int num : array) {
            System.out.println(num);
        }

        System.out.println("Dynamic Array (for normal): ");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
