package udemy_course.section5;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10;
            reverse += digit;
            temp /= 10;
        }
        return reverse == number;
    }
}
