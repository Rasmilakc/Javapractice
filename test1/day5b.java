package test1;

public class day5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3) write an example for multiple level inheritance(a->-c)
		 Son1 rosan=new Son1("narayan","khatri","suresh","rosan");
		  System.out.println(rosan.firstName);
		  System.out.println(rosan.lastName);
		   System.out.println(rosan.FfirstName);
		   System.out.println(rosan.Sname);
		   rosan.displayGName();
		   rosan.displayFName();
		   rosan.displaySName();
		    

	}

}
 class Grandfather1 {
	String firstName;
    String lastName;
	 public Grandfather1(String fn,String ln) {
	 this.firstName=fn;
     this.lastName=ln;
		  }
	public void displayGName() {
	  System.out.println(this.firstName+this.lastName);
	}
 }
class Father1 extends Grandfather1{
		  String FfirstName;
		  public Father1(String fn,String ln,String ffn) {
		  super(fn,ln);
		   this.FfirstName=ffn;
		  }
		  public void displayFName() {
		    System.out.println(this.FfirstName+this.lastName);
		  }
		}
		class Son1 extends Father1{
		 String Sname;
		 public Son1(String fn,String ln,String ffn,String ssn) {
		    super(fn,ln,ffn);
		    this.Sname=ssn;
		  }
		  public void displaySName() {
		    System.out.println(this.Sname+this.lastName);
		  }
		  
		}


		  

	


