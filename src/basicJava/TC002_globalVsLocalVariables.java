package basicJava;



public class TC002_globalVsLocalVariables {
	
	//Global or Class level variables
	int i = 100;
	int j = 200;

	public static void main(String[] args) {
	//local variables
	int k = 300;
	int l = 400;
	System.out.println("this is Main Method");
	System.out.println(k+l);
	
	//This is how we call global variables by creating an object
	TC002_globalVsLocalVariables obj = new TC002_globalVsLocalVariables();
	System.out.println(obj.i);
	System.out.println(obj.j);
	
	//this is how we call sub method inside main method
	obj.tester();
	}
	
	//this is sub method
	public void tester(){
	//local variables	
	int m = 500;
	int n = 600;
	System.out.println("this is sub Method");
	System.out.println(m+n);
		
		
	}

}
