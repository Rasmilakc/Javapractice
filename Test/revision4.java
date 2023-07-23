package Test;

public class revision4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "Irving";
		switch (city) {
		case "Herndon":
		System.out.println("VA");
		case "washigton":
			System.out.println("Dc");
		case "california":
			System.out.println("CA");
		case "Newyork":
			System.out.println("NY");
		default:
			System.out.println("In correct city name");
		}

		switch (city) {
	   case "Columbia":
			System.out.println("MD");
			break;
	  case "Buffalo":
			System.out.println("CA");
			break;
	  case "Herndon":
			System.out.println("VA");
		break;
	  case "Colsville":
			System.out.println("MD");
			break;
		default:
			System.out.println("In correct city name");

		}
		
		
		switch (city) {
		case "Baltimore":
		case "Annapolis":
			System.out.println("MD");
			break;
		case "Irving":
		case "Austin":
			System.out.println("TX");
			break;
		case "juneau":
		case "fairbanks":
			System.out.println("Ak");
			break;
		case "varanasi":
		case "lucknow":
			System.out.println("UP");
			break;
		default:
			System.out.println("In correct city name");

		}
		
		
		
		
		

	}
}