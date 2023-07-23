package test1;

public class day4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object without contructor
		StudentA niva=new StudentA();
		System.out.println(niva.firstName);
		System.out.println(niva.lastName);
		System.out.println(niva.age);
		niva.displayName();
		
		
		TeacherA niva1=new TeacherA();
		System.out.println(niva1.salary);
		System.out.println(niva1.firstName);
		System.out.println(niva1.lastName);
		System.out.println(niva1.age);
		niva1.displaySalary();
		niva1.displayName();
		
		
	
	}
}
class StudentA{
	String firstName="rasmila";
	String lastName="khatri";
	int age=30;
	
	
	

	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
}
class TeacherA extends StudentA{
	int salary=45000;
	public void displaySalary() {
		System.out.println(this.salary);
	}
}