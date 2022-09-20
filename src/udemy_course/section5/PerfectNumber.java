package udemy_course.section5;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));  // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5));  // true
        System.out.println(isPerfectNumber(-1)); // false
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int divisor = 1;
        int sum = 0;
        while (divisor < number) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }
        return number == sum;
    }
}
