import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        while (length < 1) {
            System.out.println("Enter the length of the array:");
            length = scanner.nextInt();
        }

        int[] numbers = new int[length];
        int counter = 0;
        while (counter < length) {
            System.out.println("Enter the next number for your array:");
            numbers[counter] = scanner.nextInt();
            counter++;
        }

        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        if (max % 2 == 0) {
            System.out.println(max + " is even number.");
            long factorial = 1;
            for (int i = 1; i <= max; i++) {
                factorial *= i;
            }
            System.out.println("the factorial of " + max + " is " + factorial);
        } else {
            System.out.println(max + " is odd number.");
        }
    }
}