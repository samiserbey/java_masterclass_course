package udemy_course.section5;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9, 18));   // -1
        System.out.println(getGreatestCommonDivisor(12, 30));  // 6
        System.out.println(getGreatestCommonDivisor(15, 25));  // 5
        System.out.println(getGreatestCommonDivisor(81, 153)); // 9
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 1;
        int commonDivisor = 1;
        while (first >= divisor && second >= divisor) {
            if (first % divisor == 0 && second % divisor == 0) {
                commonDivisor = divisor;
            }
            divisor++;
        }
        return commonDivisor;
    }
}
