import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class BetController {
    public ArrayList<Bet> bets;
    public Date betsDate;

    public BetController(ArrayList<Bet> bets, Date betsDate) {
        this.bets = bets;
        this.betsDate = betsDate;
    }

    public Team getWinner(ArrayList<Bet> bets) {
        return new Team("Default");
    }

    public float totalBets(ArrayList<Bet> bets){
        return bets.stream().map(Bet::getBetAmount).reduce((a, b) -> a + b).get();
    }

    public Match createRandomMatch(){
        return new Match(new Date(System.currentTimeMillis()),new Team("Default 1"), new Team("Default 2"));
    }


}
