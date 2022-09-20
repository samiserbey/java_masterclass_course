package udemy_course.section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
