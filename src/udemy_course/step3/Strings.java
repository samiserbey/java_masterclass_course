package udemy_course.step3;

public class Strings {
    public static void main(String[] args) {
        String myString = "hello";
        System.out.println(myString);
        myString = myString + ", Sami.";
        System.out.println(myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }
}
