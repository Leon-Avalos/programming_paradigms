import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class TeamsSerializer {
    public static final String TEAMS_PATH = "Teams.txt";

    /**
     * Reads the contents in a plain file with the name of the Teams
     * @param filePath Relative or absolute path to file
     */
    public static void printTeamsInFile(String filePath){
        {
            try {
                Stream<String> lines = Files.lines(Paths.get(filePath));
                lines.forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * TODO: Serialize the contents of the file into a Array of Teams
     */
    public ArrayList<Team> serializeTeams(String filePath){
        return new ArrayList<>();
    }






}
