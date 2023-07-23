package Test;

public class revision9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//two way to define array
		int[]numbers=new int[3];
		numbers[0]=11;
		numbers[1]=12;
		numbers[2]=13;
		
		int[]numbers2= {11,12,13};
		//for loop,while loop and for each loop
		for(int i=0;i<numbers.length;i++) { 
			System.out.println(numbers2[i]);
		}
		int i=0;
		while(i<numbers2.length) {
			System.out.println(numbers2[i]);
			i=i+1;
		}
		for(int a:numbers2) {
			System.out.println(a);
		}
		
		String[]names=new String[2];
		names[0]="ram";
		names[1]="sham";
				
		
		String[]names2={"ram","sham"};
		
		//for loop,while loop and loop for each
		for (int a=0;i<=names.length;a++) {
			//System.out.println(a);
			System.out.println(names[a]);
		}
		
		i=0;
		while(i<names2.length) {
			System.out.println(names2[i]);
			i=i+1;
			
			for (String y:names) {
				System.out.println(y);
			}
		}
		
		
				
		


		
		

	}

}
