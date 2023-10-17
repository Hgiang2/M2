public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String finalScore;
        int tempScore;
        if (player1Score == player2Score) {
            finalScore = switch (player1Score) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            };
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) finalScore = "Advantage " + player1Name;
            else if (minusResult == -1) finalScore = "Advantage " + player2Name;
            else if (minusResult >= 2) finalScore = "Win for " + player1Name;
            else finalScore = "Win for " + player2Name;
        } else {
            StringBuilder finalScoreBuilder = new StringBuilder();
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    finalScoreBuilder.append("-");
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case 0:
                        finalScoreBuilder.append("Love");
                        break;
                    case 1:
                        finalScoreBuilder.append("Fifteen");
                        break;
                    case 2:
                        finalScoreBuilder.append("Thirty");
                        break;
                    case 3:
                        finalScoreBuilder.append("Forty");
                        break;
                }
            }
            finalScore = finalScoreBuilder.toString();
        }
        return finalScore;
    }
}