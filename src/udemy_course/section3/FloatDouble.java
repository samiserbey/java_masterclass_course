package udemy_course.section3;

public class FloatDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFloatValue= "+myFloatValue);
        System.out.println("MyDoubleValue= "+myDoubleValue);


        double poundToKg = 0.45359237d;
        double myPoundValue = 200d;
        double myKgValue = myPoundValue * poundToKg;
        System.out.println("Converted kilograms= " + myKgValue);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
