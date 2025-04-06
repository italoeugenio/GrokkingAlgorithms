package main.youtube.codevolution.algorithm;

import org.w3c.dom.ls.LSOutput;

public class PrimeNumber {
    public static boolean primeNumber(int num){
       int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count += 1;
            }
        }

        if(count == 2){
            return true;
        } else {
            return false;
        }
    }

    public static boolean betterPrimeNumber(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(1));
        System.out.println(primeNumber(2));
        System.out.println(primeNumber(7));
        System.out.println(betterPrimeNumber(1));
        System.out.println(betterPrimeNumber(2));
        System.out.println(betterPrimeNumber(7));

    }
}
