import java.util.Scanner;
import java.lang.Math;
public class HighLow {
    public static void Game() {
        Scanner sc = new Scanner(System.in);
        int ran = (int) (1 + (Math.random() * 100));
        int guess;
        int i;
        int tries;
        System.out.println("I'm thinking of a number between 1 and 100: ");
        System.out.println("How many guesses do you want?");
        tries = sc.nextInt();
        System.out.printf("%d guesses! Let's play!\n",tries);
        for (i = 1; i <= tries; i++) {
            guess = sc.nextInt();
            if (guess == ran) {
                System.out.printf("You are correct, got it in %d!\n",i);
                break;
            }else if (tries == i){
                System.out.println("Out of guesses, you lose!");
            } else if (guess > ran) {
                System.out.println("Lower!");
            } else if (guess < ran) {
                System.out.println("Higher!");
            }
        }
    }

    public static void main(String[] args) {
        Game();
    }

}