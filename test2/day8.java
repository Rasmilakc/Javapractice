package test2;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher a=new Teacher("rohit");
		System.out.println(a.firstName);
		a.age();
		
		
		
		rose c =new rose();
		c.color();
		c.type();
	}
	
	
}
abstract class Student{
	String firstName;
	public Student(String fn) {
		this.firstName=fn;
	}
	abstract void age();
} 
class Teacher extends Student{
	public Teacher(String fn) {
		super(fn);
	}
	public void age() {
		System.out.println("my age is 32");
	}
}
abstract class Flower{
	abstract void color();
	public void type() {
		System.out.println("thera are different type of flower");
	}
} class rose extends Flower{
	public void color() {
		System.out.println("red,yellow");
	}
	
}