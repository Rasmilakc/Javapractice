package Test;

public class day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rasmila";
		System.out.println(name);
		
		// 0  1  2  3  4  5  6
		// R  A  S  M  I  L  A
		// String is collection on characters
		// String stores the value by index
		
		
		// charAt();
		
		char fifthChar = name.charAt(5);
		System.out.println(fifthChar);
		
		
		// length()
		// action - count total number of char
		// return -int
		
		// 0  1  2   3   4   5   6   7   8
		// D  e  s   h   p   a   n   d   e
		
		String lastName = "khatri";
		int totalChar = lastName.length();
		System.out.println(totalChar);
		
		
		// length -1 is always the last index
		
		
		// program 3
		
		String fatherName = "suresh";
		int totalC = fatherName.length();
		System.out.println(totalC);
		
		for(int i = 0 ; i < totalC ; i++) {
			//System.out.println(i);
			//System.out.println(fatherName.charAt(i));
			
			// i --- 0
			// i --- 1
			// i --- 2
			// i --- 3
			// i --- 4
			// i --  5
			// i --- 6
		}
		
		// program 4
		
		String city = "kathmandu";
		
		//  0  1  2   3
		//  p  u  n   e
		
		for(int i = 0 ; i < city.length() ; i++) {
			//System.out.println(i);
			System.out.println(city.charAt(i));
		}
		
		
		// program 5 
		// Print every char in reverse order
		
		for(int i = city.length()-1 ; i >= 0; i--) {
			//System.out.println(i);
			System.out.println(city.charAt(i));
			
			// i  ---- 3
			// i  -----2
			// i  -----1
			// i  -----0
		}
		
		// program 6
		
		String city2 = "Irving";
		String upperCaseString = city2.toUpperCase();
		System.out.println(upperCaseString);
		
		
		// program7
		
		String city3 = "Buffalo";
		String lowerCaseString = city3.toLowerCase();
		System.out.println(lowerCaseString);
		
		
	
		
		 
		
		
		
		
		
		
		
		
		
		

	}

}
