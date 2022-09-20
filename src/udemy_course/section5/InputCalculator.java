package udemy_course.section5;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        int count = 0;
        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }
        scanner.close();
        long average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
