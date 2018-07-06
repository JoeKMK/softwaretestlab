package basicJava;


public class TC004_staticVsNonStatic {
	 int i = 100; //this is a public variable (non-static)
	static int j = 200; //this is a static variable
	
	public static void main(String[] args) {
	//1. direct calling
	test1();
	System.out.println(j);//direct calling of static variable
	
	//2. calling by class name
	TC004_staticVsNonStatic.test1();
		System.out.println(j);//direct calling of static variable using class name
	
		// non-static way of calling
		//create an object
		TC004_staticVsNonStatic obj = new TC004_staticVsNonStatic();
		//call non-static method
		obj.test2();
		//call non-static variable
		int l = obj.i;
		System.out.println(l);
	
			}
	public static void test1(){
		System.out.println("this is static method");
		}
	
	public void test2(){
		System.out.println("this is non-static method");
		}
}
