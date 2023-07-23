package Test;

public class day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Rasmila";
		//0 1 2 3 4 5 6
		//R a s m i l a
		
		String rev="";
		
		for(int i=0;i<firstName.length();i++) {
			//System.out.println(i);
			System.out.println(firstName.charAt(i));
			rev=firstName.charAt(i)+rev;
			//R+""------->R
			//a+R-------->aR
			//s+aR------->Ras
			//m+Ras----->Rasm
		}
		System.out.println(rev);
		
		//program 2
		String City="Jorpati";
		String rev2="";
		
		// 0 1 2 3 4 5 6
		// J o r p a t i
		for(int i=City.length()-1;i>=0;i--) {
			//System.out.println(i);
			System.out.println(City.charAt(i));
			
			rev2=rev2+City.charAt(i);
		}
		System.out.println(rev2);
		
		
		//program1
		String city1="Kathmandu";
		String uc=city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("Welcome".toUpperCase()+uc);
		
		//program2
		String city2="Dharan";
		String lc=city2.toLowerCase();
		System.out.println(lc);
		
		
		//program 3
		String city3="Irving";
		int toc=city3.length();
		System.out.println(toc);
		
		//program 4
		String city4="Chabhil";
		int toc2=city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);
		
		//program 5
		String city5="Jhapa";
		char c=city5.charAt(city5.length()-1);
		System.out.println(c);
		
		//program 6
		String city6="kanpur";
		
		//0 1 2 3 4 5
		//K a n p u r
	    //String s1=city6.substring(3);
		//System.out.println(s1);
		//city6.substring(startIndex,endIndex(not included));
		
		String s2=city6.substring(1,3);
		System.out.println(s2);
		
		
		
		//program 7
		//startswith()
		String city8="changunarayan";
		boolean s3=city8.startsWith("c");
		System.out.println(s3);
		
		//Endswith
		String city9="boston";
		boolean s4=city9.endsWith("ton");
		System.out.println(s4);
		
		// EndsWith()
		String city10 = "Nepal";
		boolean s5= city9.endsWith("pal");
		System.out.println(s5);
		
		// Split()
		// come back to this after array
		String city11 = "I am learning Japanese ";
		String [] s6 = city10.split(" "); //{"I","am","learning","Japanese"}
		String [] s7 = city10.split("a"); //{"I ,"m" "le","rning j","p","nese"}
		
		//replaceFirst()
		String city12 = "I am learning python and python is good language";
		String s8 = city11.replaceFirst("python", "java");
		System.out.println(s8);
		
		//replaceAll()
		String s9 = city11.replaceAll("python", "java");
		System.out.println(s9);
		
		//replace()
		String s10 = city11.replace("I", "W");
		System.out.println(s10);
		
		//concat()
		String city13 = "Nepal";
		String city14 = "Welcome to ";
		String s11 = city14.concat(city13);
		System.out.println(s11);
		
		// contains()
		
		String city15 = "I am learning js in Japan";
		boolean s12 = city15.contains("learning");
		System.out.println(s12);
		
		
		// equal()

		String city16 = "Japan";
		String city17 = "JAPAN";
		
		boolean s13 = city16.equals(city17);
		System.out.println(s13);
		
		
		//equalIgnoreCase()
		boolean s14 = city16.equalsIgnoreCase(city17);
		System.out.println(s14);
		
		
		
		// trim()
		String city18 = " I am learning js ";
		System.out.println(city18.length());
		String s15 = city18.trim();
		System.out.println(s15.length());
		
		
		// contains 
		
		String city19 = "I am learning korean";
		String city20 = "KOREAN";
		boolean s16 = city19.toUpperCase().contains(city20);
		System.out.println(s16);
		
		
		
		
		
			
		
		

	}

}
