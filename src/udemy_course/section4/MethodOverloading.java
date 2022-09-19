package udemy_course.section4;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(-10, 1);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(157);
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static void calculateScore() {
        System.out.println("No player name, no player score.");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (inches + feet * 12) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) return -1;
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
