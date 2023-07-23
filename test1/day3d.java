package test1;

public class day3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor f=new Professor("English");
		f.displaySubjects();
		f.abc();

	}

} 
class TeacherE{
	protected String subject;
	public TeacherE(String sub) {
		this.subject=sub;
	}
	public void abc() {
		System.out.println("teacher abc");
	}
}
class Professor extends TeacherE{
	String subject="physics";
	public Professor(String sub) {
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
