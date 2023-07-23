package Test;

public class day27 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//startswith()
		String city1="Irving";
		boolean s1=city1.startsWith("I");
		System.out.println(s1);
		
		//Endswith()
		String city2="Buffalo";
		boolean s2=city2.endsWith("alo");
		System.out.println(s2);
		
		//splitswith()
		//come back to this after array
		String city3="I am learning javascript";
		String[] s4= city3.split(" ");//{"I","am","learning","javascript"}
		String[] s5=city3.split("a");//{"I","m","le","rning","j";"v","script"}
		
		//replaceFirst()
		String city6 = "I am learning dancing and dancing is good";
		String s7 = city6.replaceFirst("dancing","singing");
		System.out.println(s7);
		
		//replaceall()
		String s8=city6.replaceAll("dancing","singing");
		System.out.println(s8);
		
		//replace()
		String s9=city6.replace("a","b"); 
		System.out.println(s9);
		
		//concat
		String city10="Austin";
		String city11="Welcome to";
		String s10=city11.concat(city10);
		System.out.println(s10);
		
		//contains()
		String city12="I am learning js in nepal";
		boolean s11=city12.contains("learning");
		System.out.println(s11);
		
		// equal()
		String city13 = "kathmandu";
		String city14 = "KATHMANDU";
		
		boolean s12 = city13.equals(city14);
		System.out.println(s12);
		
		//equalIgnorecase()
		boolean s13=city13.equalsIgnoreCase(city14);
		System.out.println(s13);
		
		//trim()
		String city15="I am learning js";
		System.out.println(city15.length());
		String s14=city15.trim();
		System.out.println(s14.length());
		
		//contains
		String city16="I am learning spanish";
		String city17="SPANISH";
		boolean s15=city16.toUpperCase().contains(city17);
		System.out.println(s15);
		
		

		
		
		
		
				
		

		

		
				
		
		
		
				
				
		

		
				

		
				
	}

}
