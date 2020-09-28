import java.util.Scanner;


/**
 * This is a RandomNumberGuesser class
 * It contains static methods, one method will return the highest value and 
 * another method will return the lowest value
 * @author Frank Choukouali
 *
 */
public class RandomNumberGuesser {
	static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args) {
		final String PROGRAMMER_NAME="Frank Choukouali";
		int nextGuess,highGuess, lowGuess;
		int randNumd, correctVal=0;
		String playAgain ="yes";
		while(playAgain.equalsIgnoreCase("yes")) {
			highGuess=100; lowGuess=0;
			randNumd= RNG.rand();
			System.out.println("Enter your first guess :");
			nextGuess = stdin.nextInt();
			while(RNG.inputValidation(nextGuess, lowGuess, highGuess)==false) {
				nextGuess = stdin.nextInt();
			}
			
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
	
	
	
	/**
	 * @param guessNumber is the value enter by the user
	 * @param random is the value generate by the method inside the class RNG
	 * @param oldGuess is the old value enter by the user
	 * @return the highest value 
	 */
	public static int highValue(int guessNumber, int random, int oldGuess) {
		if(guessNumber > random ) {
			System.out.println("you guess is too high");
			return guessNumber;
		}
		return oldGuess; 
	}
	
	/**
	 * @param guessNumber is the value enter by the user
	 * @param random is the value generate by the method inside the class RNG
	 * @param oldGuess is the old value enter by the user
	 * @return the lowest value
	 */
	public static int lowValue(int guessNumber, int random, int oldGuess) {
		if(guessNumber < random ) {
			System.out.println("you guess is too low");
			return guessNumber;
		}
		return oldGuess;
	}

}
