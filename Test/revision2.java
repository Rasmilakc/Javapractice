package Test;

public class revision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparision operator
		//<,>,<=,>=,==,!=
		System.out.println(10<6);
		System.out.println(3>2);
		System.out.println(3<=2);
		System.out.println(3>=2);
		System.out.println(3==3);
		System.out.println(7!=7);
		
	   //logical opeartor
	  //AND--&&
	   // true  &&   true  ======> true
	  // false &&   true  ======> false
	 // true  &&   false ======> false
    // false &&   false  =====>  false
		System.out.println(2==2 && 3==3);
	    System.out.println(5!=5 && 6==6);
	    System.out.println(12==12 && 11!=11);
		System.out.println(2==3 && 5==7); 
		
		// true  ||   true  ======> true
		// false ||   true  ======> true
		// true  ||   false ======> true
		// false ||   false ======> false
						
				
		  System.out.println(12 == 12 || 11 == 11); 
		  System.out.println(12 != 12 || 11 == 11); 
		  System.out.println(12 == 12 || 11 != 11); 
		  System.out.println(12 != 12 || 11 != 11);
				
				//NOT - !
				
				//true  ---- false
				//false ---- true
				
				System.out.println(! (2 == 2));
				System.out.println(! (2 != 2));
				

	}

}
