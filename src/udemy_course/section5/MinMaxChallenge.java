package udemy_course.section5;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int inputInt = scanner.nextInt();
                scanner.nextLine();
                if (inputInt < min) {
                    min = inputInt;
                }
                if (inputInt > max) {
                    max = inputInt;
                }
            } else {
                break;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scanner.close();
    }
}
