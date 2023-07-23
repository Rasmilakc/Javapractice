package test1;

public class day1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one parent two children
		DaughterC rasmila=new DaughterC("suresh","khatri","rasmila");
		SonC rosan=new SonC("suresh","khatri","rosan");
		
		rasmila.displayDName();
		rasmila.displayFName();
		
		
		rosan.displaySName();
		rosan.displayFName();

	}
	
	

}
class FatherC{
	String firstName;
	String lastName;
	public FatherC(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	public void displayFName() {
		System.out.println(this.firstName+this.lastName);
	}
}
class SonC extends FatherC{
	String Sname;
	public SonC( String fn,String ln,String sn) {
		super( fn,ln);
		this.Sname=sn;
	}
	public void displaySName() {
		System.out.println(this.Sname+this.lastName);
	}
} class DaughterC extends FatherC{
	String DName;
	public DaughterC(String fn,String ln,String dn) {
		super( fn,ln);
		this.DName=dn;
	} 
	public void displayDName() {
		System.out.println(this.DName+this.lastName);
	}



	



		

	}


