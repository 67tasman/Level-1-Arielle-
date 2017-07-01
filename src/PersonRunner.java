
public class PersonRunner {
public static void main(String[] args) {

Person Rick = new Person();
System.out.println("Rick is a "+ Rick.getAge() + " year old " + Rick.getGender() + " with " + Rick.getHairColor() + " and is " + Rick.getHeight() + "feet tall.");

Rick.setAge(70);
Rick.setGender("male");
Rick.setHairColor("blue");
Rick.setHeight(6);
System.out.println("Rick is a "+ Rick.getAge() + " year old " + Rick.getGender() + " with " + Rick.getHairColor() + " and is " + Rick.getHeight() + "feet tall.");
}
}