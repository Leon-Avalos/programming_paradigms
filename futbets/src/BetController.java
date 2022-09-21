import java.util.ArrayList;
import java.util.Date;

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
}
