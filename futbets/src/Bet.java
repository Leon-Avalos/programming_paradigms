public class Bet {
    public Match match;
    public String gamblerId;
    public float betAmount;


    public Bet(Match match, String gamblerId, float betAmount) {
        this.match = match;
        this.gamblerId = gamblerId;
        this.betAmount = betAmount;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public String getGamblerId() {
        return gamblerId;
    }

    public void setGamblerId(String gamblerId) {
        this.gamblerId = gamblerId;
    }

    public float getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(float betAmount) {
        this.betAmount = betAmount;
    }
}
