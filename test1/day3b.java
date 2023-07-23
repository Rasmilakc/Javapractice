package test1;

public class day3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalB cat = new AnimalB(6);
		//System.out.println(cat.age);
		cat.displayAge();
		int a1=cat.updateAge(10);
		System.out.println(a1);
		
		cat.displayMessage();
		

		}

	}

	class AnimalB {

		private int age;
		public AnimalB(int ag) {
			this.age = ag;
		}

		
		// method returning string
		
		private String  displayName() {
			return "I am dog";
		}

		public void displayAge() {
			System.out.println(this.age);
		}
		
		// methods returning int

		public int updateAge(int updatedAgee) {
			this.age = updatedAgee;
			return this.age;
		}
		
		public void displayMessage() {
			String msg = displayName();
			System.out.println(msg);
		}
		
		
		

	

	}


