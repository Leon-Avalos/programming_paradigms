import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Burn Baby Burn!");

        // Users
        User mike = new User("123", "Mike");
        User rasputin = new User("466", "Rasputin");
        // Retrieve the Teams from file
        List<Team> teams = TeamsSerializer.serializeTeams(TeamsSerializer.TEAMS_PATH);
        // Create 2 random matches for tetsing purposes
        Match m1 = Match.createRandomMatch(teams);
        Match m2 = Match.createRandomMatch(teams);

        System.out.println(m1);

        m1.createRandomScore();
        m2.createRandomScore();

        List<Match> matches = Arrays.asList(m1, m2);

        List<Team> winners = matches.stream().map(Match::getWinner).toList();

        //BetController seasonGame = new BetController(bets,new Date(System.currentTimeMillis()));
        //seasonGame.createRandomScore(testMatch);

        // Get user info and asign to ranndom match
        User inputUser = BetController.getUserInfo();

        // Creates tow dummy bets
        Bet b1 = new Bet(m1.teamA,m1, mike.Id, 10000);
        Bet b2 = new Bet(m2.teamB, m2, rasputin.Id, 8500);

        // Creates a list od bests to process using streams
        List<Bet> bets = Arrays.asList(b1, b2);

        // Once the bets and matches are created, initialize controller to query for info
        BetController seasonGame = new BetController(bets, new Date(System.currentTimeMillis()));

        // Total amount of bets
        float total = seasonGame.totalBets();

        // Summarizing
        System.out.println("Total apostado: " + total);
        System.out.println("\t\tMatch 1");
        System.out.println("Ganador Match 1: " + m1.getWinner());
        System.out.println("Goles de Equipo: " + m1.teamA.teamName + " -> " + m1.teamA.getGoalsCounter());
        System.out.println("Goles de Equipo: " + m1.teamB.teamName + " -> " + m1.teamB.getGoalsCounter());
        System.out.println("\t\tMatch 2");
        System.out.println("Goles de Equipo: " + m2.teamA.teamName + " -> " + m2.teamA.getGoalsCounter());
        System.out.println("Goles de Equipo: " + m2.teamB.teamName + " -> " + m2.teamB.getGoalsCounter());
        System.out.println("Ganadores\n");
        matches.stream().map(Match::getWinner).toList().forEach(System.out::println);
        System.out.println("\t\tApuestas!");
        bets.forEach(System.out::println);
        System.out.println("Usuario registrado: " + inputUser);



    }
}