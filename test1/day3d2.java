package test1;

public class day3d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor1 f=new Professor1("English");
		f.displaySubjects();
		f.abc();

	}

} 
class Teacher1{
	protected String subject;
	public Teacher1(String sub) {
		this.subject=sub;
	}
	public void abc() {
		System.out.println("teacher abc");
	}
}
class Professor1 extends Teacher1{
	String subject="physics";
	public Professor1(String sub) {
		super(sub);
	}
	public void displaySubjects() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}
	public void abc() {
		System.out.println("professor abc");
		super.abc();
	}
	
}
