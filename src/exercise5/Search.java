package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        int[] numbers = new int[length];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int number = input.nextInt();
        int numberIndex = -1;
        for (int i = 0; i < length; i++)  {
          if  (numbers[i] == number)  {
            numberIndex = i;
          }

        }
        System.out.println("Number index: " + numberIndex);

        
    }
}
