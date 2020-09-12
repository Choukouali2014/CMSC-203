import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Movie movie = new Movie();
		char choice='y';
		Scanner stdin = new Scanner(System.in);
		do {
			String movieTitle, movieRating;
			int numberTicket;
			System.out.println("Please, provide the title of a movie: ");
			movieTitle= stdin.nextLine();
			movie.setTitle(movieTitle);
			System.out.println("Please, provide the movie's rating : ");
			movieRating= stdin.nextLine();
			movie.setRating(movieRating);
			System.out.println("Please, provide the number of tickets sold at a (unnamed) theater : ");
			numberTicket=stdin.nextInt();
			movie.setSoldTickets(numberTicket);
			System.out.println(movie.toString());
			System.out.println("Do you want to enter another movie? (y or n) ");
			choice=stdin.next().toLowerCase().charAt(0);
			stdin.nextLine();
		}while(choice != 'n');
		
		System.out.println("Good Bye !!!");
		
	}

}
