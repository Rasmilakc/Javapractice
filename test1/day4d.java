package test1;

public class day4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one parent with two kids
		DaughterA rama= new DaughterA("suresh","khatri","rama");
		SonA raman=new SonA("suresh","khatri","raman");
		rama.displayDName();
		rama.displayFName();
		
		raman.displayFName();
		raman.displaySName();
		

	}

}class FatherA{
	String firstName;
	String lastName;
	public FatherA(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}public void displayFName() {
		System.out.println(this.firstName+this.lastName);
	}	
} class SonA extends FatherA{
	String Sname;
	public SonA(String fn,String ln,String sn) {
		super(fn,ln);
		this.Sname=sn;
	} public void displaySName() {
		System.out.println(this.Sname+this.lastName);
	}
} class DaughterA extends FatherA{
	String Dname;
	public DaughterA(String fn,String ln,String Dn) {
		super(fn,ln);
		this.Dname=Dn;
	} public void displayDName() {
		System.out.println(this.Dname+this.lastName);
	}
}				
	

