package main.youtube.codevolution.algorithm;

public class FactorialOfANumber {
    public static int factorialRecursive(int n){
        if(n == 0){
            return 1;
        }
        return n * factorialRecursive(n-1);
    }

    public static int factorial(int n){
        int result = 1;
        for(int i = n; i >= 1; i--){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(factorial(5));
    }
}
