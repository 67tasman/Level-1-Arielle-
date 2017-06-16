 
import java.util.ArrayList;
import java.util.Collections;
 
public class NetflixQueue {
	
	ArrayList<Movies> movies = new ArrayList<Movies>();
	
	public Movies getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}
 
	public void addMovie(Movies movie) {
		movies.add(movie);
	}
	
	public Movies getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
	}
 
	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movies movie : movies) {
			System.out.println(movie);
		}
	}
 
}
 
 
 
 
