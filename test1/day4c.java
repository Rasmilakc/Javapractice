package test1;

public class day4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiple inheritance
		Sonx uday=new Sonx("utasav","khanal","arun","uday");
		System.out.println(uday.firstName);
		System.out.println(uday.lastName);
		System.out.println(uday.FfirstName);
		System.out.println(uday.Sname);
		uday.displayGName();
		uday.displayFName();
		uday.displaySName();

	}

}
class Grandfatherx{
	String firstName;
	String lastName;
	public Grandfatherx(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}public void displayGName() {
		System.out.println(this.firstName+this.lastName);
	}
}class Fatherx extends Grandfatherx{
	String FfirstName;
	public Fatherx(String fn,String ln,String ffn) {
		super(fn,ln);
		this.FfirstName=ffn;
	}public void displayFName() {
		System.out.println(this.FfirstName+this.lastName);
	}
} class Sonx extends Fatherx{
	String Sname;
	public Sonx(String fn,String ln,String ffn,String sn) {
		super(fn,ln,ffn);
		this.Sname=sn;
	} public void displaySName() {
		System.out.println(this.Sname+this.lastName);
	}
}
