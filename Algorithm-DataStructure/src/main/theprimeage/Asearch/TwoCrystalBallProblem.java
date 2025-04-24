package main.theprimeage.Asearch;

public class TwoCrystalBallProblem {
    public static Integer twoCrystalBalls(boolean[] breaks){
        int ball = 2;
        int low = 0;
        int hight = breaks.length - 1;
        int mid = 0;

        while(ball > 0){
            mid = (low + hight)/2;
            System.out.println(mid);
            if(breaks[mid]){
                System.out.println(mid);
                hight = mid - 1;
                ball--;
            } else {
                low = mid + 1;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
       boolean[] teste = {false, false, false, false, true, true, true, true, true, true};
        System.out.println(twoCrystalBalls(teste));
    }
}
