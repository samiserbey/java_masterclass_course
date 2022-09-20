package udemy_course.section5;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); // true
        System.out.println(hasSameLastDigit(23, 32, 42)); // true
        System.out.println(hasSameLastDigit(9, 99, 999)); // false
    }
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }
        int xRight = x % 10;
        int yRight = y % 10;
        int zRight = z % 10;
        return xRight == yRight || xRight == zRight || yRight == zRight;
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
