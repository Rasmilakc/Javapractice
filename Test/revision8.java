package Test;

public class revision8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String firstName = "Rasmila";
		
		// String stores the value by index
		// 0   1   2  3   4   5   6
		// R   a   s  m   i  l    a

		// charAt()
		System.out.println(firstName.charAt(2));
		
		// Program 1
		// print every character of string using for loop , while loop , forEach
		for(int i = 0 ; i < firstName.length() ; i++) {
			//System.out.println(i);
			System.out.println(firstName.charAt(i));
		}
		
		// Program 2
		
		int i = 0;
		while(i < firstName.length()) {
			//System.out.println(i);
			System.out.println(firstName.charAt(i));
			i++;
		}
		
		//program 3
		//"ram" ======>  {"r","a","m"}
		for(char cc :firstName.toCharArray()) {
			System.out.println(cc);
		}
		
		// Program 4
		String city = "kathmandu";
		String b = city.toUpperCase();
		System.out.println(b);
		
		// Program 5
		String city2 = "Irving";
		String c = city2.toLowerCase();
		System.out.println(c);
		
		// Program 6
		
		String city3 = "Buffalo";
		System.out.println(city3.length());
		String d = city3.trim();
		System.out.println(d.length());
		
		// Program 7
		String city4 = "Austin";
		boolean S1 = city4.startsWith("A");
		System.out.println(S1);
		
		// Program 8
		boolean f = city4.endsWith("r");
		System.out.println(f);
		
		// Program9
		String js = "I am learning javascript and javascript is great";
		System.out.println(js.replace("I", "j"));
		String js2 = js.replaceAll("javascript", "python");
		System.out.println(js2);
		String js3 = js.replaceFirst("javascript","python");
		System.out.println(js3);
		
		// Program 10
		
		String firstNameN = "Dipesh";
		String lastNameL  = "Lama";
		String fullName = firstNameN.concat(lastNameL);
		System.out.println(fullName);
		
		
		// program 11
		
		String city7 = "las colinas";
		String city8 = "las colinas";
		String city9 = "las colinas";
		
		boolean g = city7.equals(city8);
		boolean h = city7.equalsIgnoreCase(city9);
		
		System.out.println(g);
		System.out.println(h);
		
		System.out.println(city7.contains("l"));
		System.out.println(city7.contains("la"));
		
		String city10 = "I am learning js";
		
		String [] j = city10.split(" ");  // {"I","am","learning","js"};
		for(String cc:j) {
			System.out.println(cc);
		}
		
		
		// program 12
		
		String  city11 = "Waco";
		//  0  1  2  3  
		//   w a  c  o
		
		String k = city11.substring(2);
		System.out.println(k);
		
		String l = city11.substring(2,5);
		System.out.println(l);
		
		
		// program 13
		
		String city12 = "mckinney";
		String rev = "";
		
		for(int i1 = 0 ;  i1 < city12.length() ; i1++) {
			rev =  city12.charAt(i1)+rev;
		}
		System.out.println(rev);
		
		String rev2 = "";
		for(int i1 = city12.length() -1 ;  i1 >= 0 ; i1--) {
			rev2 =  rev2 + city12.charAt(i1);
		}
		
		System.out.println(rev2);
		

	}

}
