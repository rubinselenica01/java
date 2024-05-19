public class MethodsChallenge {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition((short)15000);
        displayHighScorePosition("Rubin", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on" +
                " the high score list.");
    }

    public static short calculateHighScorePosition(short playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        }else {
            return 4;
        }
    }
}
