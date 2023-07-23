package test1;

public class day2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// overloading -same class,same methodName,different signature
		
		additionA(4,2);
		additionA(5,4,6);
		additionA(3,4,5,6);
		
	

	}
	//method 1
	public static void additionA(int x,int y) {
		System.out.println(x+y);
	} 
	//method 2
	public static void additionA(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	//method 3
	public static void additionA(int x,int y,int z,int a) {
		System.out.println(x+y+z+a);
	}

}

