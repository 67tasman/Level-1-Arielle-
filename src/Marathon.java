
public class Marathon {
public static void main(String[] args) {
	Participant Log = new Participant( "10 mph",  "Log");
	Participant Gatto = new Participant( "1 mph",  "Gatto");
	Participant Bustin = new Participant( "4 mph",  "Bustin");
	 System.out.println("There are "+ Participant.GetCount() + " runners.");
}

}

