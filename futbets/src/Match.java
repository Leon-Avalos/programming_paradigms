import java.util.Date;
public class Match {
    public Date date;
    public Team teamA;
    public Team teamB;

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
     * Create match score randomly
     */
}
