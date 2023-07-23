package Test;

public class daya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student rasmila = new Student();
		System.out.println(rasmila.firstName);
		System.out.println(rasmila.lastName);
		System.out.println(rasmila.age);
		
		rasmila.age = 12;
		rasmila.firstName = "rosna";
		rasmila.lastName = "khadka";
		
		System.out.println(rasmila.firstName);
		System.out.println(rasmila.lastName);
		System.out.println(rasmila.age);
		rasmila.displayName();
	
		
		// Creating object of TeacherA
		
		
		TeacherA a = new TeacherA();
		System.out.println(a.salary);
		
		a.firstName = "rosna a";
		a.lastName = "khadka d";
		a.age = 30;
		a.salary = 15000;
			
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.age);
		
	
		a.displaySalary();
		a.displayName();
		
		
	}

}


class Student {
	
	
	String firstName;
	String lastName ;
	int age ;
	
	public  void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
	
	
}

class TeacherA extends Student {	
	
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	

	}
