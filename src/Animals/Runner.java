package Animals;

public class Runner {
	public static void main(String[] args) {
		Cow cow = new Cow();
		Chicken chicken = new Chicken();
		Pig pig = new Pig();
		Farm farm = new Farm(pig, cow, chicken);
		farm.feedAnimals();
	}
}