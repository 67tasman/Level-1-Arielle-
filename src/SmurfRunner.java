/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */
 
public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	Handy.eat();
	System.out.println(Handy.getName());
	Smurf Papa = new Smurf("Papa");
	System.out.println(Papa.getName() + ". I'm a " + Papa.isGirlOrBoy() + " and have a " + Papa.getHatColor() + " hat.");
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName() + ". I'm a " + Smurfette.isGirlOrBoy() + " and have a " + Smurfette.getHatColor() + " hat.");
	}
}
