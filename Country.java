import java.util.Scanner;
class Country{
	public static void main(String[]args){
	String countryname;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Country Name:-");
	countryname = sc.next();
	switch(countryname){
		case"India":System.out.println("Capital of India is Delhi");
				System.out.println("Currency is Rupees");
		break;
		case"USA":System.out.println("Capital of USA is Washington D.C");
				System.out.println("Currency is US Dollar");
		break;
		case"Uk":System.out.println("Capital of Uk is London");
				System.out.println("Currency is Pound");
		break;
		case"Russia":System.out.println("Capital of Russia is Moscow");
				System.out.println("Currency is Russian Ruble");
		break;
		case"Ukraine":System.out.println("Capital of Ukarine is Kyiv");
				System.out.println("Currency is Hryvnia");
		break;
		
		default:
		System.out.println("The Country is unknown");
	}

	}





}