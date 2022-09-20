package udemy_course.step4;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));   // false
        System.out.println(canPack (1, 0, 5));   // true
        System.out.println(canPack (0, 5, 4));   // true
        System.out.println(canPack (2, 2, 11));  // true
        System.out.println(canPack (-3, 2, 12)); // false
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        while (goal > 0 && (bigCount > 0 || smallCount > 0)) {
            if (bigCount > 0 && (goal - 5) >= 0) {
                goal -= 5;
                bigCount--;
            } else if (smallCount > 0 && (goal - 1) >= 0) {
                goal -= 1;
                smallCount--;
            } else {
                return false;
            }
        }
        return goal == 0;
    }
}
