package test1;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single inheritance with contructor
		//Student rasmilaN=	new Student("rasmila","khatri",29)
		Teacher rasmilaN2=new Teacher("rasmi","kha",23,15000);
		System.out.println(rasmilaN2.firstName);
		System.out.println(rasmilaN2.lastName);
		System.out.println(rasmilaN2.age);
		System.out.println(rasmilaN2.salary);
		rasmilaN2.displayName();
		rasmilaN2.displaySalary();

	}

}class Student{
	String firstName;
	String lastName;
	int age;
	public Student(String fn,String ln,int ag) {
		this.firstName=fn;
		this.lastName=ln;
		this.age=ag;
	}
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
class Teacher extends Student{
	int salary;
	public Teacher(String fn,String ln,int ag,int sal) {
		super(fn,ln,ag);
		this.salary=sal;
	}
	public void displaySalary() {
		System.out.println(this.salary);
	}
}
