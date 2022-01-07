
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String team =  scan.nextLine();
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String[] row = file.nextLine().split(",");

                if (row[0].equals(team)) {
                    gamesPlayed++;

                    if (Integer.valueOf(row[2]) > Integer.valueOf(row[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

                if (row[1].equals(team)) {
                    gamesPlayed++;

                    if (Integer.valueOf(row[2]) > Integer.valueOf(row[3])) {
                        losses++;
                    } else {
                        wins++;
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error reading file " + fileName);
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
