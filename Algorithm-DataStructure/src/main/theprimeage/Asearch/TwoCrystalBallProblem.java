package main.theprimeage.Asearch;

public class TwoCrystalBallProblem {
    public static Integer twoCrystalBalls(boolean[] breaks) {
        int ball = 2;
        int index = 0;
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

    public static void main(String[] args) {
        boolean[] teste = {false, false, false, false, true, true, true, true, true, true};
        System.out.println(twoCrystalBalls(teste));
    }
}
