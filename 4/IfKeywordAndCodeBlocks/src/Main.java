public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //if then block
        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        //if else block
        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }

        //if else if block
        if (score < 5000 && score > 1000) {
            System.out.println("Your sce was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
}
