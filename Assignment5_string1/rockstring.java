package Assignment5_string1;
import java.util.*;
public class rockstring {
		    public static String getComputerChoice() {
		        Random random = new Random();
		        int choice = random.nextInt(3); 
		        switch (choice) {
		            case 0:
		                return "Rock";
		            case 1:
		                return "Paper";
		            case 2:
		                return "Scissors";
		            default:
		                return "";
		        }
		    }
		    public static String findWinner(String userChoice, String computerChoice) {
		        if (userChoice.equalsIgnoreCase(computerChoice)) {
		            return "Tie";
		        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
		                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
		                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
		            return "Player";
		        }
		        else {
		        	return " " ;
		        }
		        }
		    public static String[][] getGameStats(int userWins, int computerWins, int totalGames) {
		        double userWinPercentage = (double) userWins / totalGames * 100;
		        double computerWinPercentage = (double) computerWins / totalGames * 100;

		        String[][] stats = new String[2][2];
		        stats[0][0] = "Player Wins";
		        stats[0][1] = String.valueOf(userWins);
		        stats[1][0] = "Computer Wins";
		        stats[1][1] = String.valueOf(computerWins);

		        String[][] percentages = new String[2][2];
		        percentages[0][0] = "Player Win %";
		        percentages[0][1] = String.format("%.2f%%", userWinPercentage);
		        percentages[1][0] = "Computer Win %";
		        percentages[1][1] = String.format("%.2f%%", computerWinPercentage);

		        return new String[][]{stats[0], stats[1], percentages[0], percentages[1]};
		    }
		    public static void displayResults(String[][] gameResults, String[][] finalStats, int totalGames) {
		        System.out.println("--- Game Results ---");
		        System.out.printf("%-10s %-10s %-10s %-10s%n", "Game No.", "Player", "Computer", "Winner");
		        System.out.println("----------------------------------------------");
		        for (int i = 0; i < totalGames; i++) {
		            System.out.printf("%-10s %-10s %-10s %-10s%n", (i + 1), gameResults[i][0], gameResults[i][1], gameResults[i][2]);
		        }
		        System.out.println("\n--- Final Statistics ---");
		        System.out.printf("%-20s %-20s%n", "Category", "Value");
		        System.out.println("----------------------------------------------");
		        for (String[] stat : finalStats) {
		            System.out.printf("%-20s %-20s%n", stat[0], stat[1]);
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of games you want to play: ");
		        int numGames = scanner.nextInt();
		        scanner.nextLine(); 

		        int playerWins = 0;
		        int computerWins = 0;

		        String[][] gameResults = new String[numGames][3];

		        for (int i = 0; i < numGames; i++) {
		            System.out.println("\n--- Game " + (i + 1) + " ---");
		            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
		            String userChoice = scanner.nextLine();
		            String computerChoice = getComputerChoice();
		            System.out.println("Computer's choice: " + computerChoice);

		            String winner = findWinner(userChoice, computerChoice);
		            System.out.println("Winner: " + winner);

		            if (winner.equals("Player")) {
		                playerWins++;
		            } else if (winner.equals("Computer")) {
		                computerWins++;
		            }
		            gameResults[i][0] = userChoice;
		            gameResults[i][1] = computerChoice;
		            gameResults[i][2] = winner;
		        }
		        String[][] finalStats = getGameStats(playerWins, computerWins, numGames);
		        displayResults(gameResults, finalStats, numGames);

		        scanner.close();
		    }
		}

