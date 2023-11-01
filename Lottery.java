import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your two digit number: ");
        int player = scan.nextInt();
        int computer = (int) (Math.random() * 90) + 10;
        int playerOnes = player % 10;
        int playerTens = player /10;
        int computerOnes = computer % 10;
        int computerTens = computer / 10;
        System.out.println("The lottery number is: " + computer);

        if (player == computer) {
            System.out.println("You got the lottery!");
            System.out.println("You win the jackpot of $10,000");
        } else if (computerOnes == playerOnes || computerOnes == playerTens || computerTens == playerOnes || computerTens == playerTens ) {
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        } else if(computerOnes == playerOnes && computerTens == playerTens || computerTens == playerOnes && computerOnes == playerTens) {
            System.out.println("You got both digits correct.");
            System.out.println("You win $2,000");
        }
        else
            System.out.println("You did not win anything :(");
    }
}