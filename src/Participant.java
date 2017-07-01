
public class Participant {
static int numMiles;
private static int count = 0;
String speed;
String name;

public Participant(String speed, String name){
	count = count + 1;
	this.speed = speed;
	this.name = name;
}
public static int GetCount(){
	return count;
}
}
