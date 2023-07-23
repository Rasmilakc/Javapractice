package test1;

public class day5d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//4)write an example of method overriding
	    capitalone plano= new capitalone("Irving", "plano");
		    plano.loan();
		    plano.save();
		    plano.displayMessage();
		  }
}
class BOA{
	  String Irving;
	  
	  public BOA(String Irv) {
	    this.Irving= Irv;
	  }
	  
	  public void save() {
	    System.out.println(" i am save method from the BOA");
	  }
	  
	  public void loan() {
	    System.out.println(" i am loan method from the BOA");
	  }
	  
	  public void displayMessage() {
	    System.out.println("welcome to BOA");
	  }
	  
	  
	}

	class Chase extends BOA {
	  String branchName;

	  public Chase (String Irv ,String bn) {
	    super(Irv);
	    this.branchName = bn;  
	  }
	  
	  public void save() {
	    System.out.println("I am save from Chase,austin");
	    
	  }
	  
	  public void loan() {
	    System.out.println("I am loan from Chase,austin");
	  }
	    
	}

	class capitalone  extends BOA {
	  
	  String branchName;

	  public capitalone (String Irv,String bnc) {
	    super(Irv);
	    this.branchName =bnc;
	  }

	  public void save() {
	    System.out.println("I am save from capitalone,plano");
	    
	  }
	  
	  public void loan() {
	    System.out.println("I am loan from capitalone,plano");
	  }
	    



	  
}

		  
		  
		  

		

		