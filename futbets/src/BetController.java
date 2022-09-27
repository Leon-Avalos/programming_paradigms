import java.util.*;

public class BetController {
    public List<Bet> bets;
    public Date betsDate;


    public BetController(List<Bet> bets, Date betsDate) {
        this.bets = bets;
        this.betsDate = betsDate;
    }

    /*
    public static Team getUserBet() {
        Scanner sc = new Scanner(System.in);
        String teamName = sc.next();
        if (teamName.length() > 0) {
            return new Bet(new Team(teamName, ))
        }
        return new Bet()
    }*/

    /**
     * Retrieves info of the user from standard input
     * @return
     */
    public static User getUserInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Cual es su Identificacion?");
        String userID = scanner.next();
        System.out.println("> Cual es su nombre?");
        String userName = scanner.next();
        if (userID.length() > 0 && userName.length() > 0){
            return new User(userID, userName);
        }else {
            return new User("None", "Jane Doe");
        }
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