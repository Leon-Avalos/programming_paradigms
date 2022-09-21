public class Team {
    public String teamName;
    public int goals_counter;

    /**
     * To create a Team we simply need a name, goals are initialized to 0 by default
     * @param teamName Name of team
     */
    public Team(String teamName) {
        this.teamName = teamName;

        // Starts the goals marker to 0
        this.goals_counter = 0;
    }
}
