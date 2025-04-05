import java.util.Random;
import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Rock-Paper-Scissors Game!");
        System.out.println("Enter your choice: 0 for Rock, 1 for Paper, 2 for Scissors");

        int rounds = 4; // Number of rounds to play
        int i = 1; // Round counter

        while (i <= rounds) {
            System.out.println("\nRound " + i);
            System.out.print("Your turn (0, 1, or 2): ");
            
            int Your_Turn;
            Your_Turn = sc.nextInt();
           
            if( Your_Turn<0 || Your_Turn>2){
                System.out.println("Invalid input. Please enter a number between 0 and 2.");
                continue;
            }

            // Validate input
            if (Your_Turn < 0 || Your_Turn > 2) {
                System.out.println("Invalid choice. Please enter 0 (Rock), 1 (Paper), or 2 (Scissors).");
                continue;
            }

            // Generate computer's choice
            int Computer_Turn = rand.nextInt(3);

            // Display choices
            System.out.print("You chose: ");
            switch (Your_Turn) {
                case 0 -> System.out.println("Rock");
                case 1 -> System.out.println("Paper");
                case 2 -> System.out.println("Scissors");
            }

            System.out.print("Computer chose: ");
            switch (Computer_Turn) {
                case 0 -> System.out.println("Rock");
                case 1 -> System.out.println("Paper");
                case 2 -> System.out.println("Scissors");
            }

            // Determine the winner
            System.out.print("Result: ");
            if (Your_Turn == Computer_Turn) {
                System.out.println("It's a draw!");
            } else if ((Your_Turn == 0 && Computer_Turn == 2) ||
                       (Your_Turn == 1 && Computer_Turn == 0) ||
                       (Your_Turn == 2 && Computer_Turn == 1)) {
                System.out.println("Congratulations! You won!");
            } else {
                System.out.println("Oops! The computer won. Better luck next time!");
            }

            i++; // Increment round counter
        }

        System.out.println("\nGame Over! Thanks for playing.");
        sc.close();
    }
}
