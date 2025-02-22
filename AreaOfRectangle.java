import java.util.Scanner;
class AreaOfRectangle{
	public static void main(String[]args){
		int len,bre;
		Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Length");
		len=sc.nextInt();
		System.out.println("Enter the Breadth");
		bre=sc.nextInt();
		
		System.out.println("The Length is:"+ len);
		System.out.println("The Breadth is:"+bre);
		System.out.println("Area of rectangle is:"+ len*bre);
		
		


	}



}
