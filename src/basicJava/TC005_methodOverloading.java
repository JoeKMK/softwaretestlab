package basicJava;

public class TC005_methodOverloading {
	public static void main(String[] args) {
		//object created 
		TC005_methodOverloading x= new TC005_methodOverloading();
		x.sum();
		x.sum(100);
		x.sum(100,200);
		x.sum(10.00);
		}
	
	//Here we have created same method but with diffrent input parameters 
	//and this concept is called as method overloading
	//similar to this sub method we can also create in main method too
	public void sum(){
		System.out.println("this is first method");
		
	}
	public void sum(int i){
		System.out.println("this is second method");
		System.out.println(i);
	}
	public void sum(int i , int j){
		
		System.out.println("this is third method");
		System.out.println(i+j);
	}
	public void sum(double d){
		System.out.println("this is fourth method");
		System.out.println(d);
	}
}
