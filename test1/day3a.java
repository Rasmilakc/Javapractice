package test1;

public class day3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//use of super keyword in java
		Tulip a=new Tulip();
		a.displaymessage();
		
		
		
	}
} class Flower{
	public void display() {
		System.out.println("i like flower");
	}
} class Tulip extends Flower{
	public void display() {
		System.out.println("i like tulip");
	}
	public void displaymessage() {
		display();
		super.display();
	}
}

	