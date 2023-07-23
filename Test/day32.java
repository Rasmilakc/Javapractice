package Test;

public class day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Multi-dimensional array
		int[][] marks3 = new int[3][4];
		marks3[0][0] = 11;
		marks3[0][1] = 12;
		marks3[0][2] = 13;
		marks3[0][3] = 14;

		marks3[1][0] = 10;
		marks3[1][1] = 20;
		marks3[1][2] = 30;
		marks3[1][3] = 40;

		marks3[2][0] = 55;
		marks3[2][1] = 66;
		marks3[2][2] = 77;
		marks3[2][3] = 88;

		System.out.println(marks3[1][2]);
		System.out.println(marks3[1][0]);
		System.out.println(marks3[1][3]);
		
		
		
//		{
//		{11,12,13,14},
//		{10,20,30,40},
//		{55,66,77,88}
//	}
	
	   // program 1
	   // for loop

	for (int i = 0; i < marks3.length; i++) {
		// System.out.println(i);
		int[] arr = marks3[i]; //{11,12,13,14} //{10,20,30,40} , {55,66,77,88}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	} 
	
	
	     //program 2
	
	int[][] numbers2 = {

			{ 11, 12, 13 },
			{ 10, 20, 30 }, 
			{ 77, 88, 99 } 
		};

	for (int i = 0; i < numbers2.length; i++) {
		int[] arr = numbers2[i];
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
	  
	     // while loop
		// program 3

			int r1 = 0;

			while (r1 < numbers2.length) {
				int arr[] = numbers2[r1];
				int c1 = 0;
				while (c1 < arr.length) {
					System.out.println(arr[c1]);
					c1 = c1 + 1;
				}
				r1++;
			}
			
			
			//program 4
			
			for(int [] row:numbers2) {
				for(int col : row) {
					System.out.println(col);
				}
			}
			
			
			
			
			
	}
	
	
	
	
	
}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

			
			

			
			
		
			
	
	
	
	
	
	
	
	
	

	
		
		
		
			
		
		
		
		
		

		
		

				
	
		

	


