package main.youtube.codevolution.algorithm;

public class PowerOfTwo {
    public static boolean powerOfTwo(double n){
        while(n >= 1){
            if (n == 1) {
                return true;
            }
            n/=2;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("1: " + powerOfTwo(1));
        System.out.println("2: " + powerOfTwo(2));
        System.out.println("3: " + powerOfTwo(3));
        System.out.println("4: " + powerOfTwo(4));
        System.out.println("5: " + powerOfTwo(5));
        System.out.println("16: " + powerOfTwo(16));
    }
}
