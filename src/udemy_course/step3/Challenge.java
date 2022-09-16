package udemy_course.step3;

public class Challenge {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double result = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("Result = " + result);
        double theRemainder = result % 40.00d;
        System.out.println("Remainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
