package Test;

public class daya1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// multiple inheritance
		Son rosan=new Son("Narayan","khatri","Suresh","rosan");
		System.out.println(rosan.firstName);
		System.out.println(rosan.lastName);
		System.out.println(rosan.FfirstName);
		System.out.println(rosan.SfirstName);
		rosan.displayGName();
		rosan.displayFName();
		rosan.displaySName();
	}
}
class Grandfather{
	String firstName;
	String lastName;
	public Grandfather(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	public void displayGName() {
		System.out.println(this.firstName+this.lastName);
	}
} class Father extends Grandfather{
	String FfirstName;
	public Father( String fn,String ln,String ffn) {
		super(fn,ln);
		this.FfirstName=ffn;
	} public void displayFName() {
		System.out.println(this.FfirstName+this.lastName);
	}
} 
class Son extends Father{
	String SfirstName;
	public Son(String fn,String ln,String ffn,String ssn) {
		super(fn,ln,ffn);
		this.SfirstName=ssn;
	}
	public void displaySName() {
		System.out.println(this.SfirstName+this.lastName);
	}
	}

	