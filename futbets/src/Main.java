import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println("Burn Baby Burn!");

        Team teamA = new Team("Chivas");
        Team teamB = new Team("America");

        User mike = new User("123", "Mike");
        User rasputin = new User("123", "Rasputin");

        Match todayGame = new Match(new Date(System.currentTimeMillis()), teamA, teamB);

        Bet bet1 = new Bet(todayGame,mike.Id, 10000);
        Bet bet2 = new Bet(todayGame, rasputin.Id, 15000);

        ArrayList<Bet> bets = new ArrayList<>();

        bets.add(bet1);
        bets.add(bet2);

        BetController seasonGame = new BetController(bets,new Date(System.currentTimeMillis()));

        System.out.println(seasonGame.betsDate);


        // Get the total amount in game
        Optional<Float> total_bets = bets.stream().map(Bet::getBetAmount).reduce((a, b) -> a + b);

        float totalBets = bets.stream().map(Bet::getBetAmount).reduce((a, b) -> a + b).get();

        System.out.println(total_bets.get());
        System.out.println(totalBets);


    }
}