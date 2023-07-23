package test1;

public class day2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//overloading with same class,same method name and different signature
		calculator a=new calculator();
		a.substraction(12, 5);
		a.substraction(12, 5, 3);
		a.substraction(12, 5, 3, 2);
		

	}

}
class calculator{
	public void substraction(int x,int y) {
	System.out.println(x-y);
	}
	public void substraction(int x,int y,int z) {
		System.out.println(x-y-z);
	}
	public void substraction(int x,int y,int z,int a) {
		System.out.println(x-y-z-a);
	}
}
