public class Team {
    public String teamName;
    public int goalsCounter;

    public int getGoalsCounter() {
        return goalsCounter;
    }

    public void setGoalsCounter(int goalsCounter) {
        this.goalsCounter = goalsCounter;
    }

    /**
     * To create a Team we simply need a name, goals are initialized to 0 by default
     * @param teamName Name of team
     */
    public Team(String teamName) {
        this.teamName = teamName;

        // Starts the goals marker to 0
        this.goalsCounter = 0;
    }

    @Override
    public String toString(){
        return teamName;
    }
}
