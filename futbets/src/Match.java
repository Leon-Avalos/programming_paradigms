import java.util.Date;
import java.util.List;
import java.util.Random;

public class Match {
    public Date date;
    public Team teamA;
    public Team teamB;

    public static final int MAXIMUM_MATCH_SCORE = 6;
    public static final int TOP_RANDOM_MATCHES = 8;
    @Override
    public String toString(){
        return "Match[ " + teamA + " vs " + teamB + "], on: " + date;
    }

    /**
     * Creates a game between two teams
     * @param date Date when is created
     * @param teamA Team A to play
     * @param teamB Team B to play against the Team B
     */
    public Match(Date date, Team teamA, Team teamB) {
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;

    }

    /**
     * Created a match between random teams
     * @param teams The list of teams avaliable
     * @return A Match beetween Teams
     */
    public static Match createRandomMatch(List<Team> teams){
        Random generator = new Random();
        int randomIndexA = generator.nextInt(teams.size());
        int randomIndexB = generator.nextInt(teams.size());
        if (randomIndexA != randomIndexB){
            return new Match(new Date(System.currentTimeMillis()),teams.get(randomIndexA), teams.get(randomIndexB));
        }else {
            return new Match(new Date(System.currentTimeMillis()),teams.get(randomIndexA+1), teams.get(randomIndexB));
        }
    }

    /**
     * Creates a random score given a Match
     * @param m Match
     */
    public void createRandomScore(){
        Random generator = new Random();
        this.teamA.setGoalsCounter(generator.nextInt(MAXIMUM_MATCH_SCORE));
        this.teamB.setGoalsCounter(generator.nextInt(MAXIMUM_MATCH_SCORE));
    }

    public Team getWinner(){
        return this.teamA.getGoalsCounter() > this.teamB.getGoalsCounter()? this.teamA : this.teamB;
    }


}
