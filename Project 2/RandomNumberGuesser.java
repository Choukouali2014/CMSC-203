import java.util.Scanner;
public class RandomNumberGuesser {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		final String PROGRAMMER_NAME="Frank Choukouali";
		int nextGuess,highGuess, lowGuess;
		int randNumd, correctVal=0;
		String playAgain ="yes";
		while(playAgain.equalsIgnoreCase("yes")) {
			highGuess=100; lowGuess=0;
			RNG rng = new RNG();
			randNumd= RNG.rand();
			System.out.println("Enter your first guess :");
			
			nextGuess = stdin.nextInt();
			System.out.println("Number of guesses is "+RNG.getCount());
			while(correctVal == 0) {
				if(nextGuess==randNumd) {
					System.out.println("Congratulations, you guessed correcty");
					System.out.println("Try again ? (yes or no) : ");
					 stdin.nextLine();
					playAgain=stdin.nextLine();
					RNG.resetCount();
					break;
				}else {
					highGuess= highValue(nextGuess,randNumd,highGuess);
					lowGuess = lowValue(nextGuess,randNumd,lowGuess);
					System.out.println("Enter your guess between "+lowGuess+ " and "+highGuess);
					nextGuess = stdin.nextInt();
					while(RNG.inputValidation(nextGuess, lowGuess, highGuess)==false) {
						nextGuess = stdin.nextInt();
					}
					System.out.println("Number of guesses is "+RNG.getCount());
				}
			}
			
			
	
		}
			
		System.out.println("Thank you for playing");
		System.out.println("Programmer name : "+PROGRAMMER_NAME);
	}
	
	
	
	public static int highValue(int guessNumber, int random, int oldGuess) {
		if(guessNumber > random ) {
			System.out.println("you guess is too high");
			return guessNumber;
		}
		return oldGuess; 
	}
	
	public static int lowValue(int guessNumber, int random, int oldGuess) {
		if(guessNumber < random ) {
			System.out.println("you guess is too low");
			return guessNumber;
		}
		return oldGuess;
	}

}
