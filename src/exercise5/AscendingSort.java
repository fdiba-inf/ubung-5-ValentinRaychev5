package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        int[] numbers = new int[length];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++)  {

            int minIndex = i;
            for (int k = i + 1; k < numbers.length; k++)   {
                if (numbers[k] < numbers[minIndex])   {
                    minIndex = k;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }



        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
