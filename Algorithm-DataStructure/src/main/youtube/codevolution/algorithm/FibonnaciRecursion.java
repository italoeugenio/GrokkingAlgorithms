package main.youtube.codevolution.algorithm;

import java.util.*;

public class FibonnaciRecursion {
    public static int fibonnaciRecursion(int n){
        if(n == 0){
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonnaciRecursion(n - 2) + fibonnaciRecursion(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonnaciRecursion(3));
        System.out.println(fibonnaciRecursion(4));
        System.out.println(fibonnaciRecursion(5));
    }
}
