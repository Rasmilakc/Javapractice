package Test;

public class day20q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentC1 niraj = new StudentC1("niraj","shah",1799);
		
		System.out.println(niraj.firstName);
		System.out.println(niraj.lastName);
		System.out.println(niraj.ssn);
		niraj.displayName();
		
		TeacherC rohan = new TeacherC("rohan","roy",1665,14000);
		System.out.println(rohan.firstName);
		System.out.println(rohan.lastName);
		System.out.println(rohan.ssn);
		System.out.println(rohan.salary);
		
		rohan.displayName();
		rohan.displaySalary();
		
		

	}

}
 class StudentC1{
	 String firstName;
	 String lastName;
	 int ssn;
	 
	 public StudentC1(String fn,String ln,int ss) {
		 this.firstName=fn;
		 this.lastName=ln;
		 this.ssn=ss;
	 }
		 
	 
	 
 
    public void displayName() {
    	System.out.println(this.firstName+this.lastName);
 
    }
 }
 
 
 class TeacherC extends  StudentC1{
	// Mandatory to have child constructor as parent is having 
	// constructor
	// FirstLine of child constructor should be called to parent 
	//.. constructor	
	
		

		int salary;
		
		public TeacherC(String fn , String ln , int ss ,int sal){
				super(fn,ln,ss);
				this.salary = sal;
		}
		
		public void displaySalary() {
			System.out.println(this.salary);
		}
		
		
		
		
		
		
	}