
public class NetflixRunner {
	public static void main(String[] args) {
		
	
	Movies logan = new Movies("Logan", 5);
	Movies moana = new Movies("Moana", 1);
	Movies interstellar = new Movies("Interstellar", 4);
	Movies guardians = new Movies("Guardians of the Galaxy", 3);
	Movies jumpStreet = new Movies("21 Jump Street", 4);
	
	System.out.println(interstellar.getTicketPrice() + " for " + interstellar.getTitle());
	NetflixQueue q = new NetflixQueue();
	q.addMovie(jumpStreet);
	q.addMovie(guardians);
	q.addMovie(interstellar);
	q.addMovie(moana);
	q.addMovie(logan);
	//q.printMovies();
	for(int i = 0 ; i < 5 ; i ++){
		System.out.println("The #" + (i+1) + " movie is " + q.getMovie(i));
	}
}
}