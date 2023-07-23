package test1;

public class day5a {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	 // 2)Write a class uding construction with two property and 1 method create object of same class
	  StudentC1 niraj = new StudentC1("niraj","shah",1799);
		
		System.out.println(niraj.firstName);
		System.out.println(niraj.lastName);
		System.out.println(niraj.ssn);
		niraj.displayName();
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


