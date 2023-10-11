package _08_clean_code_refactoring.practice.b3;

public class TennisGame {
    private static final String ZERO_SCORE = "Love";
    private static final String ONE_SCORE = "Fifteen";
    private static final String TWO_SCORE = "Thirty";
    private static final String THREE_SCORE = "Forty";
    private static final String ALL = "All";
    private static final String WIN = "Win";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE = "Advantage";
    public static String getScore(String playerOneName, String playerTwoName, int playerOnescore, int playerTwoscore) {
        if(playerOnescore==playerTwoscore)
        {
            return deuce(playerOnescore,playerTwoscore);
        } else if (playerOnescore>=4||playerTwoscore>=4) {
            return advantageOrWin(playerOneName,playerTwoName,playerOnescore,playerTwoscore);
        }
        return describeScore(playerOnescore,playerTwoscore);
    }
    public static String deuce( int playerOnescore, int playeTwoscore2)
    {
       switch (playerOnescore)
        {
            case 0:
                return  ZERO_SCORE+ALL;

            case 1:
                return  ONE_SCORE+ALL;
            case 2:
                return  TWO_SCORE+ALL;
            case 3:
                return  THREE_SCORE+ALL;
            default:
                return DEUCE;
        }
    }

    public static String advantageOrWin(String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore){
        int minusResult = playerOneScore - playerTwoScore;

        if(minusResult == 1){
            return ADVANTAGE + " " + playerOneName;
        }
        else if(minusResult == -1){
            return ADVANTAGE + " " + playerTwoName;
        }
        else if(minusResult >= 2){
            return WIN + " " + playerTwoName;
        }
        else {
            return WIN + " " + playerTwoName;
        }
    }
   public static String describeScore(int playerOneScore, int playerTwoScore) {
        String[] score = {"Love", "Fifteen", "Thirty", "Forty"};
        return score[playerOneScore] + "-" + score[playerTwoScore];
    }
}
