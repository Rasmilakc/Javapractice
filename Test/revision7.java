package Test;

public class revision7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			    
		 // how to define a String
			    
	    // two ways to define array
			    
		 int [] numbers = new int [3];
	     numbers [0] = 11;
	     numbers [1] = 12;
	     numbers [2] = 13;
			    
		 int [] numbers2 = {11,22,33};
		 for (int i =0; i <numbers2.length; i++) {
			     System.out.println(numbers2[i]);
			     }
			     
		  int t1 = 0;
		  while (t1 < numbers2.length) {
		     System.out.println(numbers2[t1]);
			    t1=t1+1;
			     }
			     
			 for (int a : numbers2) {
			     System.out.println(a);
			   }
			    
			  
			     String [] names = new String [2];
			     names [0]= "ram";
			     names [1]= "sham";
			     
			     String [] names2 = {"ram","sham"};
			     
			     for (int i = 0; i < names2.length; i++) {
			      // System.out.println(i);
			       System.out.println(names2[i]);
			     }
			     
			     
			     // while loop
			     
			     int t2 = 0;
			     while (t2< names.length) {
			       System.out.println(names[t2]);
			       t2=t2+1;
			     }
			     // for each loop
			     
			     for (String a1: names2) {
			       System.out.println(a1);
			     }
			     
			  //   string reverse
			     String city="kathmandu";
			     String rev="";
			     for(int i=city.length()-1;i>=0;i--) {
			    	 rev=rev+city.charAt(i);
			     }
			     System.out.println(rev);
			     System.out.println(city.charAt(1));
			     System.out.println(city);
			     
			     
			     String city4="chabhil";
			     String rev1="";
			     for(int j=city4.length()-1;j>0;j--) {
			    	 rev1 =rev+city4.charAt(j);
			    	 
			     }System.out.println(rev1);
			     
			     
			   for (int i=0;i<numbers.length;i++)  {
				   System.out.println(numbers[i]);
				   
				   for(int i1=numbers.length-1;i1>0;i1--) {
					   System.out.println(numbers[i1]);
				   }
			   }
	}		   
		
	}
