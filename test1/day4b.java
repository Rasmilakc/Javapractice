package test1;

public class day4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single inheritance with contructor
		//Studentb rajesh=new Studentb("rajesh","giri",32);
		Teacherb rajesha=new Teacherb("raj","gi",31,14000);
		System.out.println(rajesha.firstName);
		System.out.println(rajesha.lastName);
		System.out.println(rajesha.age);
		System.out.println(rajesha.salary);
		rajesha.displayName();
		rajesha.displaySalary();

	}

}class Studentb{
	String firstName;
	String lastName;
	int age;
	public Studentb(String fn,String ln,int ag) {
		this.firstName=fn;
		this.lastName=ln;
		this.age=ag;
	} 
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
}
class Teacherb extends Studentb{
	int salary;
	public Teacherb(String fn,String ln,int ag,int sal) {
		super(fn,ln,ag);
		this.salary=sal;
	}public void displaySalary() {
		System.out.println(this.salary);
	}
}
