import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NBA {
    private static int numberOfFields = 7;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("West:\n\n");
        handleInputNBAFile("src/nba_west.in");
        System.out.println("\n\nEast:\n\n");
        handleInputNBAFile("src/nba_east.in");
    }

    public static void handleInputNBAFile(String path) throws FileNotFoundException {
        String content = new Scanner(new File(path)).useDelimiter("\\Z").next();

        String[] teams = content.split("\n");

        String[][] teamsRepresentation = new String[teams.length][numberOfFields];

        for (int i = 0; i < teams.length; i++) {
            teamsRepresentation [i] = teams[i].split(";");
        }

        Arrays.sort(teamsRepresentation, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return tryParseInt(o2[2], 0) - tryParseInt(o1[2], 0);
            }
        });

        int topWins = tryParseInt(teamsRepresentation[0][2], 0);

        System.out.println("Most wins");

        for (String[] t : teamsRepresentation) {
            if (tryParseInt(t[2], 0) != topWins) {
                break;
            }

            System.out.println(t [1]);
        }

        Arrays.sort(teamsRepresentation, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return tryParseInt(o2[3], 0) - tryParseInt(o1[3], 0);
            }
        });

        int topLoses = tryParseInt(teamsRepresentation[0][3], 0);

        System.out.println("Most loses");

        for (String[] t : teamsRepresentation) {
            if (tryParseInt(t[3], 0) != topLoses) {
                break;
            }

            System.out.println(t [1]);
        }
    }

    public static int tryParseInt(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
