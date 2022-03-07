import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = reader.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++){
            Scanner readerTwo = new Scanner(System.in);
            System.out.println("Enter a number to write to the array: ");
            int number = readerTwo.nextInt();

            numbers[i] = number;
        }

        int numbersSum = 0;
        double amountOfNumbers = numbers.length;

        for (int i = 0; i < amountOfNumbers; i++){
            numbersSum += numbers[i];
        }

        double averageNumbers = numbersSum / amountOfNumbers;

        System.out.println("Average number in array is: " + averageNumbers);

        int maxNumber = numbers[0];

        for (int i = 0; i < amountOfNumbers; i++){
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("Maximum number in array is: " + maxNumber);


    }
}
