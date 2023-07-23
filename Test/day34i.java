package Test;

public class day34i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch case without  break statement
		
		//program 1
//		
//		String city = "Indore";
//		switch (city) {
//		case "Pune":
//			System.out.println("MH");
//		case "Indore":
//			System.out.println("MP");
//		case "Jaipur":
//			System.out.println("RJ");
//		case "Lucknow":
//			System.out.println("UP");
//		default:
//			System.out.println("Incorrect city name");
//			
//		}
		
		// program 2
		String city2 = "Irvin" ;
		switch(city2) {
		case "Pune":
			System.out.println("MH");
			break;
		case "Indore":
			System.out.println("MP");
			break;
		case "Jaipur":
			System.out.println("RJ");
			break;
		case "Irving":
			System.out.println("Tx");
			break;
		default:
			System.out.println("Incorrect city name");
		}
		
		//program 3
		String city3 = "Irving";
		switch(city3) {
		case "Pune":
		case "Nagpur":
			System.out.println("MH");
			break;
		case "Indore":
		case "Bhopal":
			System.out.println("MP");
			break;
		case "Jaipur":
		case "Udaipur":
			System.out.println("RJ");
			break;
		case "waco":
		case "Irving":
		case "Austin":
			System.out.println("Tx");
			break;
		default:
			System.out.println("Incorrect city name");
		}
	
//		
		// loops - for loop and another while loop
//		for(initialization ; conditionCheck ; increment/ decrement) {
//				// statements 
//		}

		for(int i=1;i<5;i++) {
			System.out.println(i);
		}
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
		}
		for (int i=5;i>=1;i--) {
			System.out.println(i);
		}
		for(int i = 2 ; i <= 20 ; i = i + 2) {
			System.out.println(i);
		}
		
		//loop with break
		for(int i=1;i<4;i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
			
		}
		
		for(int i = 50 ; i >= 5 ; i = i - 5) { 
			System.out.println(i); 			
		if(i == 40) {
				break;
			}
		}
		
     	// program 14
		// continue statement with for 
		
		for(int i = 1 ; i <= 5 ; i++) {
		if(i == 3) {
		continue;
					}
		System.out.println(i);
					
				}
				
				// program 14
				
				for(int i = 1 ; i <= 3 ; i++) { 
					if(i == 2) {
						continue;
					}
					System.out.println(i); 
					
				}
				
				// program 15
				
				for(int i = 5 ; i >= 1 ; i --) {
					if(i == 2) {
						continue ;
					}
					System.out.println(i); 
				}
				
				
				
				
				
				
//				for(intialization ; conditionCheck ; increment/decrement) {
//				// statements
//			}

			// intialization

			// while(condition){
			// statements
			// increment or decrement
			// }
			
			// print 1 to 3

			int t1 = 1;
			while(t1 <= 3) {
				System.out.println(t1); // 1 // 2 / 3
				t1 ++; // 2//3// 4
			}
			
			// program 2
			
			// print 1 to 5
			int t2 = 1;
			while(t2 <= 5) {
				System.out.println(t2); // 1 // 2 // 3 // 4 // 5
				t2 ++; // 2 //3 // 4 // 5 // 6
			}
			
			// program 3
			
			int t3 = 5;
			while(t3 <= 50) {
				System.out.println(t3);
				t3 = t3 + 5;
			}
			
			// program4
			int t4 = 30;
			while(t4 >= 3) {
	    	System.out.println(t4);
			t4 = t4 - 3;
						}
						
			// program5
						
			int t5 = 1;
			while(t5 <= 3) {
			System.out.println("hello");
			t5 ++;
						}
						
	    	// program 6 

			int t6 = 70;
			while(t6 >= 7) {
			System.out.println(t6);
			if(t6 == 35) {
		   break; 
							}
		 t6 = t6 - 7;
						}
						
	    	// program 7
		   int t7 = 1;
		  while(t7 <= 10) {
		 if(t7 == 5) {
		t7++; // 6
		 continue;
							}
	    System.out.println(t7); // 1 // 2 // 3 // 4 // 6
							t7++; // 2  // 3 // 4 // 5 // 7
						}
						
						
						
		 			
	}			
					
		
	
}	
	
	

		