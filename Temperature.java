import java.util.Scanner;
class Temperature{
	public static void main(String[]args){
		float f,c;
		Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Tempertaure in Fahrenheit");
		f=sc.nextFloat();
		c=(f-32)*(5/9);
 		System.out.println("Enter the Tempertaure in Celsius");
		c=sc.nextFloat();
		f= c(9/5) +32;
		
		
		System.out.println("The Fahrenheit  :"+ f);
		System.out.println("The Celsius:"+ c);
		
		
		


	}



}
