package main.youtube.codevolution.algorithm;

import java.util.*;

public class FibonnaciSequence {
    public static void fibonnaci(int n){
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = a + b;

        if(n == 0 || n < 0){
            System.out.println("Null");
        }

        if (n == 1 || n >= 2){list.add(a);}
        if(n == 2 || n >= 3){list.add(b);}
        if(n == 3 || n >= 4){list.add(c);}

        for(int i = 4; i <= n; i++){
            a = b;
            b = c;
            c = a + b;
            list.add(c);
        }

        System.out.println(list);
    }

    public static List<Integer> fibonnaciTeacher(int n){
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);

        for(int i = 2; i < n; i++){
            arr.add(arr.get(i-1) + arr.get(i-2));
        }

        return arr;
    }

    public static void main(String[] args) {
        fibonnaci(1);
        fibonnaci(2);
        fibonnaci(3);
        fibonnaci(4);
        fibonnaci(5);
        fibonnaci(6);
        System.out.println("TEACHER");
        System.out.println(fibonnaciTeacher(1));
        System.out.println(fibonnaciTeacher(2));
        System.out.println(fibonnaciTeacher(3));
        System.out.println(fibonnaciTeacher(4));
    }

    //Big O = O(n)
}
