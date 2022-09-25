import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeamsSerializer {
    public static final String TEAMS_PATH = "Teams.txt";

    /**
     * Reads the contents in a plain file with the name of the Teams
     * @param filePath Relative or absolute path to file
     */
    public static void printTeamsInFile(String filePath){
            try {
                Stream<String> lines = Files.lines(Paths.get(filePath));
                lines.forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    /**
     * Serialize a plain text file into a List of Teams
     * @param filePath Path to file of teams, can be absolute or relative
     * @return List of teams created with the name imported from the file
     */
    public static List<Team> serializeTeams(String filePath){
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.map(line -> new Team(line)).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






}
