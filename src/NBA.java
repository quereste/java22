import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class NBA {
    private static int numberOfFields = 7;

    public static void main(String[] args) throws FileNotFoundException {
        handleInputNBAFile("src/nba_west.in");
    }

    public static void handleInputNBAFile(String path) throws FileNotFoundException {
        String content = new Scanner(new File(path)).useDelimiter("\\Z").next();

        String[] teams = content.split("\n");

        String[][] teamsRepresentation = new String[teams.length][numberOfFields];

        for (int i = 0; i < teams.length; i++) {
            teamsRepresentation [i] = teams[i].split(";");
        }

        for (int i = 0; i < teamsRepresentation.length; i++) {
            System.out.println(Arrays.toString(teamsRepresentation[i]));
        }
    }

    public int tryParseInt(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
