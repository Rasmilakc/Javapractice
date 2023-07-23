package Test;

public class DAY2 {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		//Print 1 t0 5
		//loop
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		//reverse
			for(int i=5;i>0;i--) {
				System.out.println(i);
			}
			//while loop
			 int t1=0;
			while(t1>5) {
				System.out.println(t1);
				t1=t1+1;
			}
			//reverse while loop
			int t2=5;
			while(t2>0) {
				System.out.println(t2);
				t2=t2-1;
			}
			 int[]numbers =new int[5];
			 numbers[0]=10;
			 numbers[1]=20;
			 numbers[2]=30;
			 numbers[3]=40;
			 numbers[4]=50;
			 System.out.println(numbers[0]);
			 System.out.println(numbers[1]);
			 System.out.println(numbers[2]);
			 System.out.println(numbers[3]);
			 System.out.println(numbers[4]);
			 
			//loop
			 for(int i=0;i<numbers.length;i++) {
				 System.out.println(numbers[i]);
				 
			 }
			 
			 //reverse
			 for(int i=numbers.length-1;i>=0;i--) {
				 System.out.println(numbers[i]);
			 }
			// while loop
			 int t3=0;
			 while(t3<0) {
				 System.out.println(numbers[t3]);
				 t3=t3+1;
			 }
		 
			 //multidimensional array
			 int[][] mks=new int[3][4];
			 mks[0][0]=10;
			 mks[0][1]=20;
			 mks[0][2]=30;
			 mks[0][3]=40; 
			 
			 mks[1][0]=10;
			 mks[1][1]=40;
			 mks[1][2]=60;
			 mks[1][3]=70;
			 
			 mks[2][0]=100;
			 mks[2][1]=200;
			 mks[2][2]=300;
			 mks[2][3]=400;
			 
			 System.out.println(mks[2][2]);
			 
			 //loop
			 for(int i=0;i<mks.length;i++) {
				// System.out.println(i);
				 int[] arr=mks[i];
				 for(int j=0;j<arr.length;j++) {
					 System.out.println(arr[j]);
					 
				 }
				 
				// reverse loop
				 for(int i1=mks.length-1;i1>0;i1--) {
					// System.out.println(i);
					 int[] arr1=mks[i];
					 for(int j=mks.length-1;j>0;j--) {
						 System.out.println(arr1[j]);
					 }
					 //while loop
					t1=0;
					while(t1<mks.length);
					System.out.println(mks[t1]);
					t1=t1+1;
				 }
				//reverse while loop
				 t2=mks.length-1;
				 while(t2>=0);{
				 System.out.println(mks[t2]);
				 t2=t1-1;
				 }
				// for each loop
			
			int[]row= {11,12,13,14};
				for( int col:row) { 
					System.out.println(col);
				}
			
			
	
					 
			 
			 
			 
			 
			
			 
					 



			}
					 
		
	
			}		

	}	
	

