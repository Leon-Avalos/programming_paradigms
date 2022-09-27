import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.List;

public class BetController {
    public List<Bet> bets;
    public Date betsDate;


    public BetController(List<Bet> bets, Date betsDate) {
        this.bets = bets;
        this.betsDate = betsDate;
    }


    /**
     * Returns the total amount of bets
     *
     * @param bets List of bets from the users
     * @return The total amount of bets
     */
    public float totalBets() {
        return this.bets.stream().map(Bet::getBetAmount).reduce((a, b) -> a + b).get();
    }

}