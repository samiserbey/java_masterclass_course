package udemy_course.section5;

public class WhileLoop {
    public static void main(String[] args) {
        // while
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            System.out.println("Even number: " + number);
            if (evenNumbersFound == 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

        // do while
        int count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 15) {
                break;
            }
        } while(count != 6);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}