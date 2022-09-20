package udemy_course.section5;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));   // 0
        System.out.println(sumFirstAndLastDigit(257)); // 9
        System.out.println(sumFirstAndLastDigit(252)); // 4
        System.out.println(sumFirstAndLastDigit(5));   // 10
        System.out.println(sumFirstAndLastDigit(-10)); // -1
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number == 0) {
            return 0;
        }
        int sum = -1;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            if (sum == -1) {
                sum = digit;
            }
        }
        sum += digit;
        return sum;
    }
}
