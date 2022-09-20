package udemy_course.section5;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99));  // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }
    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || y < 10 || x > 99 || y > 99) {
            return false;
        }
        while (x != 0) {
            int xDigit = x % 10;
            x /= 10;
            int tempY = y;
            while (tempY != 0) {
                int yDigit = tempY % 10;
                if (xDigit == yDigit) {
                    return true;
                }
                tempY /= 10;
            }
        }
        return false;
    }
}
