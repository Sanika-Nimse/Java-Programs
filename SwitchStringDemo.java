import java.util.Scanner;
class SwitchStringDemo{
	public static void main(String[]args){
	String moviename;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your Favorite Movie");
	moviename=sc.next();
	switch (moviename){
		case"Kabir singh": System.out.println("Shahid Kapoor, Kiara Advani are actors");
		break;
		case"citadel": System.out.println("Varun Dhawan , Sam are actors");
		break;
		case"Kalki":System.out.println("Prabhas, Deepika are actors");
		break;
		
		default:
		System.out.println("i'm not knowing");
		




	}
	
	

	}








}