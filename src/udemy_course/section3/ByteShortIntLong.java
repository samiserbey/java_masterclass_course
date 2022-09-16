package udemy_course.section3;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted Minimum Value: " + (myMinIntValue - 1)) ;
        System.out.println("Busted Maximum Value: " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        long myLongValue = 100L; // L is important for number not be considered as int

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);



        byte testByteValue = 10;
        short testShortValue = 20;
        int testIntValue = 50;
        long testLongValue = 50000L + 10L * (testByteValue + testShortValue + testIntValue);
        System.out.println(testLongValue);

        short testShortTotal = (short) (1000 + 10 *
                (testByteValue + testShortValue + testIntValue));
    }
}
