package Test;

public class dayone {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("bye");
	
		
		
		
		//Arithmetic operator
		//Addition-->+
		//Subtraction-->-
		//Multiplication-->*
		//Division-->/
		//Modulus-->%
		int x=10;
		int y=5;
		System.out.println("x");
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
		int a=8; int b=4;
		System.out.println(a+b);
	System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	
		//calling function
		calculator(9,3);
		addA();
		addB(12,6);
		 int z = addC(8,4);
		 System.out.println(z);
		 System.out.println(z+z);
		 System.out.println(z*0.10);
		
	
		
				
	
		
	}
	
	//creating the function
	public static void calculator (int x,int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	//function without parameter without return type
	
	public static void addA() {
		System.out.println(8+8);
	}
	
	//function with parameter without return type
	public static void addB(int x,int y) {
		System.out.println(x+y);
	} 
	
	//function with parameter with return type
	
	public static int  addC(int x,int y) {
		return(x+y);
	}
	
	
	
	
	
	
	
	

}
