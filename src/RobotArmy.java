
public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
Human Jeff = new Human("Jeff");
		//2. create a new Robot army of good and evil robots.
Robot Rubin = new Robot("Rubin", true);
Robot Jeb = new Robot("Jeb", true);
Robot Pog = new Robot("Pog", false);
Robot Dolfin = new Robot("Dolfin", false);
Robot Nick = new Robot("Nick", true);
Robot Java = new Robot("Java", false);
		//3. command your robot army to destroy a human

Rubin.destroy(Jeff);
Pog.destroy(Jeff);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}
