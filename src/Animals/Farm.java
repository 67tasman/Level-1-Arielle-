package Animals;

public class Farm {
	Pig pig;
	Cow cow;
	Chicken chicken;

	Farm(Pig pig, Cow cow, Chicken chicken) {
		
	}

	void feedAnimals() {
		cow.eat();
		chicken.eat();
		pig.eat();
	}
}
