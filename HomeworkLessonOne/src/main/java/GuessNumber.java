import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Integer numberToBeGuessed = new Random().nextInt(100);
        Integer guessed = null;
        int i = 5;

        Scanner scan = new Scanner(System.in);
        while (i > 0){
            System.out.println("Guess a number: ");
            guessed = scan.nextInt();
            if (guessed < numberToBeGuessed){
                System.out.println("To small");
            }else if (guessed > numberToBeGuessed){
                System.out.println("To big");
            }else{
                break;
            }
            i--;
            System.out.format("%d tries left" + "\n", i);
        }
        if (correctNumber(numberToBeGuessed, guessed)){
            System.out.println("Congrats, you've won!");
        }else{
            System.out.format("You've lost. Correct number was %d", numberToBeGuessed);
        }
    }
    private static boolean correctNumber(Integer numberToBeGuessed, Integer guessed){
        return numberToBeGuessed.equals(guessed);
    }
}
