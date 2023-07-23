package Test;

public class revision10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program1
		String Cities[][]= {
				{"Kathmandu,Lalitpur"},
				{"Irving","Austin"},
				{"NeWyork","Buffalo"},
				
				};
	//	System.out.println(Cities[1][0]);
	//System.out.println(Cities[0][1]);
	   
		
		//for loop
		for(int i=0;i<Cities.length;i++) {
			String city[]=Cities[i];
			for(int j=0;j<city.length;j++) {
				System.out.println(city[j]);
			}
			
			//for while loop
			int a1=0;
			while(a1<Cities.length) {
				String b[]=Cities[a1];
				int b2=0;
				while(b2<b.length) {
					System.out.println(b[b2]);
					b2++;
				}
				a1++;
			}
			
			//for each loop
			for (String[]s1:Cities) {
				for(String s2:s1) {
					System.out.println(s2);
				}
				
			}
		}
		
		
		} 
	

	}


