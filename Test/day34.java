package Test;

public class day34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arthimetic operator
		
		int a=10;
		int b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		//calling the function
		calculator(4,2);
		AddA();
		AddB(3,9);
		int z= AddC(4,5);
		System.out.println(z);
		System.out.println(z+z);
		System.out.println(z*0.10);	
		
		
		
		//comparision operator
		System.out.println(12<6);
		System.out.println(3 > 2);
		System.out.println(3 <= 2);
		System.out.println(3 >= 2);
		System.out.println(3 <= 3);
		System.out.println(3 >= 3);
		System.out.println(3 != 3);
		System.out.println(3 != 4);
		System.out.println(7 == 4);
		System.out.println(7 == 7);
		
		
		//logical operator
		//AND----&&
		// true    &&     true  -------> true
		// false   &&     true  -------> false
		// true    &&     false -------> false 
		// false   &&     false -------> false
		
		System.out.println(7 == 7 && 8 == 8);
		System.out.println(7 != 7 && 8 == 8);
		System.out.println(7 == 7 && 8 != 8);
		System.out.println(7 != 7 && 8 != 8);
		
		// OR  ---  ||
		
	    // true    ||     true  -------> true
	   // false    ||     true  -------> true
	  // true      ||     false -------> true 
	 // false      ||     false -------> false
		
				
	    System.out.println(8 == 9 || 8 == 9);
	    System.out.println(8 == 8 || 8 == 9);
	    System.out.println(8 == 1 || 8 == 8);
	    System.out.println(8 == 8 || 8 == 8);
	    
	     
	   // Not----!
	    //true-----false
	    //false-----true
	    System.out.println(!(8==8));
	    System.out.println(!(9==8));
	    
	    
	    // conditional statement
	  
	 	// one input and multiple outcomes

	 	// numT > 0 && numT <= 5 --------> 10 % discount
	   // numT > 5 && numT <= 10 --------> 20 % discount
	  // numT > 10 --------> 30 % discount

//	 		if(condition) {
//	 			// statements will be executed
//	 		}
//	 		
	    int numT=19;
	    if (numT > 0 && numT <= 5) {
			System.out.println("10 % discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("20 % discount");
		}
		if (numT > 10) {
			System.out.println("30% discount");
		}
		
		
	     //program 2
		
		int numTa = -14;

		if (numTa > 0 && numTa <= 5) {
			System.out.println("10 % discount");
		} else if (numTa > 5 && numTa <= 10) {
			System.out.println("20 % discount");
		} else if (numTa > 10) {
			System.out.println("30 % discount");
		} else {
			System.out.println("Incorrect input");
		}
		
		//Program 3
		
		int marks = 92;

		if (marks > 90) {
			System.out.println("Grade A");
		}
		if (marks > 75) {
			System.out.println("Grade B");
		}
		if (marks > 65) {
			System.out.println("Grade C");
		}
		
		// program 4

				int marksB = 54;

				if (marksB > 90) {
					System.out.println("Grade A");
				} else if (marksB > 75) {
					System.out.println("Grade B");
				} else if (marksB > 65) {
					System.out.println("Grade C");
				} else {
					System.out.println("Fail try again");
				}

				// program 5

				int a1 = 10;
				int b1 = 50;

				if (a1> b1) {
					System.out.println("a1 is greater");
				} else {
					System.out.println("b1 is greater");
				}

				// program 6

				int x1 = 10;
				int y1 = 50;
				int z1 = 200;

				if (x1 > y1 && x1 > z1) {
					System.out.println("x1 is greater");
				} else if (y1> x1 && y1 > z1) {
					System.out.println("y1 is greater");
				} else {
					System.out.println("z1 is greater");
				}

			}

		


	    
	    
				 
		
		
		

				
		
		
	
	
	//creating thefunction
	public static void calculator(int a,int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		
	}
	
	//Function without parameter and without return type
	public static void AddA() {
		System.out.println(9+9);
	}
	
	//function with parameter and without return type
	public static void AddB(int a,int b) {
		System.out.println(3+9);
	}
	
	//function with parameter with return type
	public static int AddC(int a,int b) {
		System.out.println(a+b);
		return a+b;
		
		
	}
	
	

	}
	
	
	
	
		
	
     
    
    
		
		
	








