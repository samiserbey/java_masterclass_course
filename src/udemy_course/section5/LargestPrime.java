package udemy_course.section5;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));  // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0));   // -1
        System.out.println(getLargestPrime(45));  // 5
        System.out.println(getLargestPrime(-1));  // -1
    }

    public static int getLargestPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
        return -1;
    }
}
