package Test;

public class day33i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 Rasmila=new Human2("Rasmila khatri chhetri",30);
		Human2 Rohan=new Human2("Rohan thapa", 22);
		
		
		System.out.println(Rohan.age);
		System.out.println(Rohan.name);
		
		System.out.println(Rasmila.age);
		System.out.println(Rasmila.name);
		
		String b=Rasmila.talk();
		System.out.println(b);

	}

}
class Human2{
	int age;
	String name;
	
	public Human2(String nm,int ag) {
		this.name=nm;
		this.age=ag;
	}
	
	public String talk() {
		return"Hello";
		
	}
	public void walk() {
		System.out.println("I am walking");
	}
}
