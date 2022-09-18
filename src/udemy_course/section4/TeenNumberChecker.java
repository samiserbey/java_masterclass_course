package udemy_course.section4;
    
public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));  // true
        System.out.println(hasTeen(23, 15, 42));  // true
        System.out.println(hasTeen(22, 23, 34)); // false
    }
    public static boolean hasTeen(int x, int y, int z) {
        if(isTeen(x)) return true;
        if(isTeen(y)) return true;
        if(isTeen(z)) return true;
        return false;
    }
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;     
    }
 
}
