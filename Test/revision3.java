package Test;

public class revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//conditional statement
		int numT=20;
		if(numT>0 && numT<=7);
		 System.out.println("10% discount");
		 if (numT>7 && numT<=10);
		 System.out.println("15% discount");
		 if(numT>10) {
			 System.out.println("20% discount");
		 }
		 
		 //program 2
		 int numT1=-14;
		 if (numT1 > 0 && numT1 <= 5) {
				System.out.println("10 % discount");
			} else if (numT1 > 5 && numT1 <= 10) {
				System.out.println("20 % discount");
			} else if (numT1 > 10) {
				System.out.println("30 % discount");
			} else {
				System.out.println("Incorrect output");
			}
		 
		 
		 int marks=92;
		 if(marks>92) {
			 System.out.println("Grade A");
		 }else if(marks>75) {
			 System.out.println("Grade B");
		 }else if (marks>65) {
			 System.out.println("Grade c");
		 }else {
			 System.out.println("try it again");
		 }
		 
		 //program 3
		 int x=20;
		 int y=60;
		 int z=80;
		 
		 if(x>y && x>z) {
		 System.out.println("x is greater");
	} else if(y>x && y>z) {
		 System.out.println("y is greater");
    }else { 
    	System.out.println("z is greater");
    }
		 // Ternary operator
		 int a =15;
		 int b=20;
		 String a2=a>b ?"a is greater":"b is greater";
		 System.out.println(a2);
			 
		 
	}
	
	

}
