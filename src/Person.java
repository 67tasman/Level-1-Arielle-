
public class Person {
private int age;
private String hairColor;
String gender;
int height;

public void setAge(int age){
	this.age = age;
}
public int getAge(){
	return age;
}

public void setHairColor(String hairColor){
	this.hairColor = hairColor;
}
public String getHairColor(){
	return hairColor;
}

public void setGender(String gender){
	this.gender = gender;
}
public String getGender(){
	return gender;
}

public void setHeight(int height){
	this.height = height;
}
public int getHeight(){
	return height;
	
	
}
public Person(int age, String hairColor, String gender, int height){
	this.age = age;
	this.hairColor = hairColor;
	this.gender = gender;
}
}
