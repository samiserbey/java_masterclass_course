package udemy_course.section5;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);  // "One Two Three".
        System.out.println();
        numberToWords(1010); // "One Zero One Zero".
        System.out.println();
        numberToWords(1000); // "One Zero Zero Zero".
        System.out.println();
        numberToWords(-12);  // "Invalid Value"
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int digitCount = getDigitCount(number);
            number = reverse(number);
            int digit = 0;
            while (number > 0) {
                digit = number % 10;
                digitCount--;
                switch(digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }
                number /= 10;
            }
            while (digitCount > 0) {
                System.out.println("Zero");
                digitCount--;
            }
        }
    }
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;

        }
        return reversed;

    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
