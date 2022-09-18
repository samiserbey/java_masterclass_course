package udemy_course.section4;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int highScore = calculateScore(gameOver, score, 5, 100);
        System.out.println("Your final score was " + highScore);
        score = 10000;
        highScore = calculateScore(gameOver, score, 5, 100);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louis", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        }  else if (score >= 100) {
            position = 3;
        }
        return position;
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
}
