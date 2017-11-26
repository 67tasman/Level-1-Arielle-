
public class ConstructorTest {
	public static void main(String[] args) {
Dog dog = new Dog("kevin", 5);
Dog pog = new Dog("pog", 1);
dog.sayHi();
pog.sayHi();
	}
}

class Dog{
	//data
	String name;
	int age;
	
	Dog(String n, int a){
		name = n;
		age = a;
		System.out.println("dog created");
		System.out.println(name );
	
	}
	void sayHi() {
		System.out.println(name + " says hi" + " and he's " + age);
	}

}