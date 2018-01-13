public class Minion {
String name;
int eyes;
String color;
String master;
	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Object getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public Object getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String string) {
		// TODO Auto-generated method stub
		this.master = string;
		
	}

	public Object getMaster() {
		// TODO Auto-generated method stub
		return master;
	}

}
