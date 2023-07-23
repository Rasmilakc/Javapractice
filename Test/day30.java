package Test;

public class day30 {

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
			
			
			
			
			// program 2
			
			String [] cities = new String [5];
			
			cities[0] = "jorpati";
			cities[1] = "morang";
			cities[2] = "itahari";
			cities[3] = "boudha";
			cities[4] = "kathmandu";
			
			//System.out.println(cities[0]);
			
			// looping through array
			
			for(int i = 0 ; i < cities.length ; i++) { 
				System.out.println(i); 
				System.out.println(cities[i]);
				
			}
			
			// i ---- 0
			// i ---- 1
			// i ---- 2
			// i ---- 3
			// i ---- 4
			
			//               0  1   2  3   4   5
			int [] marks = {20,30,40,45,50, 55};
			
			for(int i = 0 ; i < marks.length ; i++) {
				System.out.println(marks[i]);
			}
			
			System.out.println("Reverse ------------");
			
			for(int i = marks.length -1 ; i >= 0 ; i-- ) {
				System.out.println(marks[i]);
			}
			
			
			// program 3
			
			int mks [] = {30,40,50,60,70,80,99};
			
			int t1 = 0;
			
			while(t1 < mks.length) {
				System.out.println(mks[t1]);
				t1 = t1 + 1;
			}
			
			
			
			int t2 = mks.length -1 ;
			while(t2 >= 0) {
				System.out.println(mks[t2]);
				t2 = t2 - 1;
			}
			
			
			// program 4 (for each loop)
			
			String [] icecream = {"vanilla","strawberry","chocochip"};
			int [] mks2 = {11,22,33};
		
			for(String a :icecream) {
				System.out.println(a);
			}
			
			for(int b :mks2) {
				System.out.println(b);
			}
			
				
			
		

	}

}
