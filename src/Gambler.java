public class Gambler{
    /**
     * initialize stack is 100
     * initialize bet is 1
     * checking wheather win the bet or lose
     * if win then bet will increase by 1
     * if decrease then bet will decrease by 1
     *
     */
    static int EverydayStack = 100;
    static int BetStack = 1;

    public static void main(String[] args) {
        System.out.println("Welcome To Gambling");
        System.out.println("Every Day Stack is " + EverydayStack);
        System.out.println("Betting price is " + BetStack);

        double Bet = Math.random();
        if (Bet < 0.5) {

            System.out.println("win the bet" + (EverydayStack += BetStack));
        } else {
            System.out.println("Floss the bet " + (EverydayStack -= BetStack));
        }

    }

}