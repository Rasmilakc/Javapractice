package Test;

public class day30i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program  1
		//type [] nameOfArray = new type[lengthOfarray]
		// Array stores the value by index
		
		int [] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		numbers[4] = 35;
		
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		int [] numbers2 = {11,12,13,14,15};
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		System.out.println(numbers2[4]);
		
		
	    //program 2
		
        String [] cities = new String [5];
		
		cities[0] = "Irving";
		cities[1] = "Austin";
		cities[2] = "Baltimore";
		cities[3] = "Buffalo";
		cities[4] = "Miami";
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);
		
		//looping through array
		for(int i=0;i<cities.length;i++) {
			System.out.println(i);
			System.out.println(cities[i]);
		}
		
		//i----0
		//i----1
		//i----2
		//i----3
		//i----4
		
		//
		int[]marks= {20,30,40,50,60};
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("Reverse------");
		
		for(int i=marks.length-1;i>0;i--){
		System.out.println(marks[i]);
		}
		
		
		//program 3
		
		int mks[]= {30,40,50,60,70};
		
		 int t1=0;
		 
		 while(t1<mks.length) {
			 System.out.println(mks[t1]);
			 t1=t1+1;
		 }
		 
		 
		 int t2=mks.length-1;
		 while (t2>=0) {
			 System.out.println(mks[t2]);
			 t2=t2-1;
		 }
		 
		 //program4(for each loop)
		 
		 String[] icecream= {"vanilla,strawberry,chocochip,blueberry"};
		 int[] mrks2= {10,11,12};
		 
		 for(String a:icecream) {
			 System.out.println(a);
		 }
		 
		 for(int b:mrks2){
			 System.out.println(b);
		 }
			 
			 
		
			 
		 
				 
		
	
		
	
		
				
				
		
		
		
		
		
		
		
		
		
				
	}

}
