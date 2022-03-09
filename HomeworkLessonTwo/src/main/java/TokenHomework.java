import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TokenHomework {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size of the array (5,10,15): ");
        int length = reader.nextInt();

        if (length == 5 || length == 10 || length == 15){
            System.out.println(tokenGenerator(length));
        }else {
            System.out.println("Sorry, you did not follow the instructions.");
        }
    }

    static int randomNumberRange(int min, int max){
        Random r = new Random();

        return r.nextInt(max - min) + min;
    }

    public static String tokenGenerator(int len){
        int i = 0;
        String token = "";
        String regex = "[a-zA-Z0-9!@#$%^&*()]";
        Pattern pattern = Pattern.compile(regex);
        while (i < len){
            int number = randomNumberRange(33, 123);
            char characterSymbol = (char)number;
            String stringSymbol = Character.toString(characterSymbol);
            Matcher matcher = pattern.matcher(stringSymbol);
            if (matcher.matches()){
                token += stringSymbol;
                i ++;
            }
        }
        return token;
    }
}
