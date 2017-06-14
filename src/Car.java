import javax.swing.JOptionPane;

public class Car {
	String myColor;
	int myPrice;
	double cost;

	public Car(String color, int price) {
		myColor = color;
		myPrice = price;
		cost = (double) (price) * .75;
	}

	void sell() {
		JOptionPane.showMessageDialog(null, "You have sold a(n) " + myColor + " car, for $" + myPrice + ".");
	}

	void build() {
		JOptionPane.showMessageDialog(null, "You have built a(n) " + myColor + " car. It cost $" + cost + ", to build.");
	}
}
