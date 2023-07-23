package Test;

public class revision5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// loops

//		for(intialzation ; conditionCheck ; increment/decrement) {
//			// statement
//		}
//		

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) { 
			System.out.println(i); 
		}

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}

		for (int i = 50; i >= 5; i = i - 5) {
			System.out.println(i);
		}

		// break with for

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i); 
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}

		}

		// for with continue
		for (int i = 1; i <= 5; i++) { 
			if (i == 3) {
				continue;
			}

			System.out.println(i); 
		}

		// while

		// intialization
//		while(condition) {
//			// stataments
//			
//			// increment / decrement
//		}

		int t1 = 1;

		while (t1 <= 3) {
			System.out.println("hello");
			t1++;
		}

		int t2 = 1;
		while (t2 <= 3) {
			System.out.println(t2);
			t2++;
		}

		int t3 = 5;
		while (t3 >= 1) {
			System.out.println(t3);
			t3--;
		}

		int t4 = 2;
		while (t4 <= 20) {
			System.out.println(t4);
			t4 = t4 + 2;
		}

		int t5 = 50;
		while (t5 >= 5) {
			System.out.println(t5);
			t5 = t5 - 5;
		}

		int t6 = 10;
		while (t6 >= 1) {
			if (t6 == 5) {
				break;
			}
			System.out.println(t6);
			t6--;
		}

		int t7 = 1;
		while (t7 <= 5) {
			if (t7 == 3) {
				t7 ++; 
				continue;
			}
			System.out.println(t7); 
			t7++;
		}

	}



	}


