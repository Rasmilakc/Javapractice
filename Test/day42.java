package Test;

public class day42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		// program 1

//		Person rasmila = new Person("rasmila","khatri,30);
		Person[] students = { new Person("rasmila", "Khatri", 30), new Person("anoj", "shrestha", 33),
				new Person("raj", "lama", 29), new Person("piya", "rai", 28), new Person("asha", "dahal", 22)

		};

		// for loop
		for (int i = 0; i < students.length; i++) {
			students[i].displayName();
		}

		// while
		int t1 = 0;
		while (t1 < students.length) {
			students[t1].displayName();
			t1++;
		}

		// forEach

		for (Person student : students) {
			student.displayName();
		}

// program 2

		Calculator june = new Calculator();
		june.addition(12, 13); 
		june.addition(11, 13,14); 
		june.addition(20, 30, 40, 50); 

	}

}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class Calculator {

	public void addition(int x, int y) {
		System.out.println(x + y);
	}

	public void addition(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public void addition(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}



	}
