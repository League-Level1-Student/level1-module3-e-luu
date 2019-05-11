package netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Avengers Infinity War", 9);
		Movie movie2 = new Movie("Avengers End Game", 10);
		Movie movie3 = new Movie("Captain Marvel", 8);
		Movie movie4 = new Movie("Spiderman Homecoming", 6);
		Movie movie5 = new Movie("Black Panther", 7);
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + movie1);
		
	}
}
