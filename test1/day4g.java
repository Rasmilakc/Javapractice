package test1;

public class day4g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//use of super in java
		Banana a=new Banana();
		a.displaymessage();
		
	}
}class fruits{
	public void display() {
		System.out.println("i love fruits");
	}
}
class Banana extends fruits{
	public void display() {
		System.out.println("i dont like banana");
	}public void displaymessage() {
		display();
		super.display();
	}
}