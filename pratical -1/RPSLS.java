import java.util.Random;
import java.util.Scanner;

public class RPSLS {

    enum Move {
        ROCK, PAPER, SCISSORS, LIZARD, SPOCK
    }

    static int winner(Move a, Move b) {
        return switch (a) {
            case ROCK -> (b == Move.SCISSORS || b == Move.LIZARD) ? 1 :
                         (b == Move.PAPER || b == Move.SPOCK) ? -1 : 0;

            case PAPER -> (b == Move.ROCK || b == Move.SPOCK) ? 1 :
                          (b == Move.SCISSORS || b == Move.LIZARD) ? -1 : 0;

            case SCISSORS -> (b == Move.PAPER || b == Move.LIZARD) ? 1 :
                             (b == Move.ROCK || b == Move.SPOCK) ? -1 : 0;

            case LIZARD -> (b == Move.SPOCK || b == Move.PAPER) ? 1 :
                           (b == Move.ROCK || b == Move.SCISSORS) ? -1 : 0;

            case SPOCK -> (b == Move.SCISSORS || b == Move.ROCK) ? 1 :
                          (b == Move.LIZARD || b == Move.PAPER) ? -1 : 0;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        for (int round = 1; round <= 5; round++) {

            Move computerMove = Move.values()[random.nextInt(Move.values().length)];

            System.out.println("\nRound " + round);
            System.out.print("Enter your move (ROCK, PAPER, SCISSORS, LIZARD, SPOCK): ");

            Move playerMove = Move.valueOf(sc.next().toUpperCase());

            int result = winner(playerMove, computerMove);

            System.out.println("You chose: " + playerMove);
            System.out.println("Computer chose: " + computerMove);

            if (result == 1) {
                System.out.println("Round winner: You");
                playerScore++;
            } else if (result == -1) {
                System.out.println("Round winner: Computer");
                computerScore++;
            } else {
                System.out.println("Round winner: Tie");
            }
        }

        System.out.println("\nFinal Score: You " + playerScore + "-" + computerScore + " Computer");

        if (playerScore > computerScore) {
            System.out.println("You win " + playerScore + "–" + computerScore);
        } else if (computerScore > playerScore) {
            System.out.println("Computer wins " + computerScore + "–" + playerScore);
        } else {
            System.out.println("It's a tie " + playerScore + "–" + computerScore);
        }

        sc.close();
    }
}