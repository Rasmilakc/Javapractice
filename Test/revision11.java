package Test;

public class revision11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonC Rasmila = new PersonC();
		System.out.println(Rasmila.age);
		System.out.println(Rasmila.fullName);
		Rasmila.age = 12;
		Rasmila.fullName = "Rasmila Khatri";
		System.out.println(Rasmila.age);
		System.out.println(Rasmila.fullName);

		PersonC amol = new PersonC();
		amol.fullName = "Salman Khan";
		amol.age = 32;
		amol.displayName();
		
		PersonD chinmay2 = new PersonD("Rasmila2 Khatri2", 33);
		chinmay2.displayName();

		
		PersonD chinmay3 = new PersonD("Rasmila3 Khatri3", 32);
		chinmay3.displayName();

	}

}

class PersonC {
	// properties
	// class fields
	int age;
	String fullName;

	public void displayName() {
		System.out.println(this.fullName);
	}

}

class PersonD {

	String fullName;
	int age;

	public PersonD(String fn, int ag) {
		this.fullName = fn;
		this.age = ag;
	}

	public void displayName(){
		System.out.println(this.fullName);
	}
	
	
	
	

	}
