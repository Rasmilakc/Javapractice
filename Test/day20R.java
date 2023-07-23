package Test;

public class day20R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentB roman = new StudentB();
		System.out.println(roman.firstName);
		System.out.println(roman.lastName);
		System.out.println(roman.ssn);
		roman.displayName();
		
		
		
		TeacherB romanb = new TeacherB();
		System.out.println(romanb.salary);
		System.out.println(romanb.firstName);
		System.out.println(romanb.lastName);
		System.out.println(romanb.ssn);
		
		romanb.displaySalary();
		romanb.displayName();
		
	}
	
	
	

}

class StudentB {
	String firstName = "rasmila";
	String lastName = "khatri";
	int ssn = 2655;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherB  extends StudentB{
	int salary = 15000;
	public void displaySalary() {
		System.out.println(this.salary);
	}

		

	}


