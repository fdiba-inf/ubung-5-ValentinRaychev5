package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int length = input.nextInt();

        int[] numbers = new int[length];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();
        
        for (numberIndex = 0; numberIndex < length; numberIndex++)  {
          if  (numbers[numberIndex] == number)  {
            System.out.println("Number index: " + numberIndex);
          }
        }

        
    }
}
