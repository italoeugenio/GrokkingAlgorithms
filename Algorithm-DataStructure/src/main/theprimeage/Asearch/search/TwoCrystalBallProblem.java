package main.theprimeage.Asearch.search;

public class TwoCrystalBallProblem {
    public static Integer twoCrystalBalls(boolean[] breaks) {
        int ball = 2;
        int index = 0;

        if(breaks.length == 1){
            if(breaks[0]){
                return 0;
            }else {
                return -1;
            }
        }

        for (int i = 0; i < breaks.length; i+=2) {
            if (breaks[i]) {
                ball--;
                index = i;
                break;
            }
        }

        if(!breaks[index - 1]){
            ball--;
            return index;
        } else {
            ball--;
            return index - 1;
        }
    }


    public static Integer Correction(boolean[] breaks){
        int jumpAmount = (int) Math.floor(Math.sqrt(breaks.length));
        int i = jumpAmount;

        for(; i < breaks.length; i += jumpAmount){
            if(breaks[i]){
                break;
            }
        }

        i-= jumpAmount;
        for(int j = 0; j <= jumpAmount && i < breaks.length; j++){
            if(breaks[i]){
                return i;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        boolean[] test = {false, false, false, false, true, true, true, true, true, true};
        System.out.println(Correction(test));
    }
}
