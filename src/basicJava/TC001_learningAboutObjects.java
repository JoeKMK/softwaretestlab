package basicJava;

public class TC001_learningAboutObjects {
	//these are global variable or class level variables
	int a;
	int b;

	public static void main(String[] args) {
	//this is how we represent a object in java
	// we use class name to represent a object
	//here c is the object reference variable
	//new learningAboutObjects() is the new object we have created
	TC001_learningAboutObjects c = new TC001_learningAboutObjects();
	//this is how we represent global variables inside a method
	c.a=10;
	System.out.println(c.a);
	c.b =20;
	System.out.println(c.b);
	}
	}