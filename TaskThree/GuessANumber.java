
import java.util.Random;
import java.util.Scanner;  

public class GuessANumber 
{
    private static int rnd_number;

	
    public static void main(String[] args) 
	{
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess()
	{ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your guess:");
        if (scanner.hasNextDouble())
        {
			double guessDouble = scanner.nextDouble();
		
			if (guessDouble % 1 != 0)
			{
				System.out.println("Please type out a whole number");
				makeAGuess();
				return;
			}
		
			int guess = (int) guessDouble;
		
			if (guess == rnd_number) 
			{
				System.out.println("Congratulations! You guessed the right number: " + rnd_number);
            } 
			else if (guess < rnd_number) 
			{
                System.out.println("Your guess is too low. Try again.");
                makeAGuess();
            } 
			else 
			{
                System.out.println("Your guess is too high. Try again.");
                makeAGuess();
            }
		}
			else
			{
				System.out.println("Invalid input! Please enter a numeric value.");
				scanner.next();
				makeAGuess(); 
			}
		
	}
}
