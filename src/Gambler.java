

import java.util.Random;

public class Gambler {
    static int EverydayStack = 100;
    static int BetStack = 1;

    public static void main(String[] args) {
        int StackIncrease = 150;
        int StackDecrease = 50;
        int win =0;
        System.out.println("Welcome To Gambling");
        System.out.println("Every Day Stack is " + EverydayStack);
        System.out.println("Betting price is " + BetStack);



        while(EverydayStack > StackDecrease && EverydayStack < StackIncrease) {
            double rand = Math.random();

            if(rand < 0.5) {
                //  System.out.println("Bet Win");
                System.out.println("Win and amount is "+(EverydayStack +=BetStack));
            }else {
                //  System.out.println("Bet Loss");
                System.out.println("Loss and amount is "+(EverydayStack -= BetStack));
            }
        }
    }
}