package Test;

public class dayb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//single inheritence
	  //StudentN rojeshN =new StudentN("rojesh","maharjan",12);
	
		
		TeacherN rojeshBN = new TeacherN("roj","maha",12,1244);
		
		System.out.println(rojeshBN.firstName);
		System.out.println(rojeshBN.lastName);
		System.out.println(rojeshBN.age);
		System.out.println(rojeshBN.salary);
		
		rojeshBN.displayName();
		rojeshBN.displaySalary();
		
	}

}


class StudentN {
	
	String firstName;
	String lastName ;
	int age;
	
	public StudentN(String fn , String ln , int ag) {
			
		this.firstName  = fn;
		this.lastName  = ln;
		this.age  = ag;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}
class TeacherN  extends StudentN{
	
	int salary;
	public TeacherN(String fn , String ln , int ag, int sal) {
		super(fn,ln,ag);
		this.salary = sal;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
}