package Test;

public class day33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 
		//boolean
		//string
		//Array
		//Char
		//uder defined data type
		
		
		//creating a instance or object
		Human Rasmila = new Human();
		System.out.println(Rasmila.age);
		System.out.println(Rasmila.name);
		Rasmila.walk();
		Rasmila.talk();
		
		Rasmila.age =30;
		Rasmila.name = "Rasmila khatri chhetri";
		System.out.println(Rasmila.age);
		System.out.println(Rasmila.name);
		
		
		// creating another object 
		
		Human parisha = new Human();
		System.out.println(parisha.age);
		System.out.println(parisha.name);
		parisha.talk();
		parisha.walk();
		
		parisha.age = 20;
		parisha.name = "parisa pandey";
		System.out.println(parisha.age);
		System.out.println(parisha.name);
				
				
				
			
				

	}

}

class Human{
	//properties and methods
	int age;
	String name;
	
	//Methods
	public void talk() {
		System.out.println( "I am talking");
		
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
	
		
	
	
	
}
