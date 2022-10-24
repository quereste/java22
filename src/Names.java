import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


// IMPORTANT: according to hint of yours, female names like Rut (listed in file)
// are considered as male ones

public class Names {
    public static void main(String[] args) throws IOException {
        List<String> listOfStrings = new ArrayList<String>();

        listOfStrings = Files.readAllLines(Paths.get("./src/imiona.in"));

        String[] array = listOfStrings.toArray(new String[0]);

        int femaleNames = 0;
        char currentFirstLetter = array[0].charAt(0);
        int currentFirstLetterOccurrences = 0;

        for (String s : array) {
            if (s.charAt(s.length() - 1) == 'a') {
                femaleNames++;
            }

            if (s.charAt(0) == currentFirstLetter) {
                currentFirstLetterOccurrences++;
            } else {
                System.out.println(currentFirstLetter + ": " + currentFirstLetterOccurrences);
                currentFirstLetter = s.charAt(0);
                currentFirstLetterOccurrences = 1;
            }
        }

        System.out.println(currentFirstLetter + ": " + currentFirstLetterOccurrences);
        System.out.println("All others: 0");

        System.out.println("WARNING! In reality: all those names are female ones");
        System.out.println("But, according to hint:");

        System.out.println("\nFemale names: " + femaleNames);
        System.out.println("Male names: " + (array.length - femaleNames));
    }
}
