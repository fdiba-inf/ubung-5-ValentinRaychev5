package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        int[] numbers = new int[length];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        int[] unique = new int[length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++)    {
            for (int k = 0; k < numbers.length; k++)  {
                if (unique[k] == 0)   {
                    unique[k] = numbers[i];
                    break;
                }
                else if(unique[k] == numbers[i])   {
                    break;
                }
            }
        }

        String uniqueNumbersAsStrings = Arrays.toString(unique);
        System.out.println("Unique numbers: " + uniqueNumbersAsStrings);
        
    }
}
