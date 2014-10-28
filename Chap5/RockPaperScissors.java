import java.util.Scanner;
public class RockPaperScissors
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock(1), scissors(2), or paper(3):");
        int player1 = scan.nextInt();
        System.out.println("Player 2: Choose rock(1), scissors(2), or paper(3):");
        int player2 = scan.nextInt(); 
        if (player1 == player2)
        {
            System.out.println("Tie");
        }
        else if (player1 > player2)
        {
            System.out.println("Player2 Wins");
        }
        else if (player2 > player1)
        {
            System.out.println("Player1 Wins");
        }
    }
}