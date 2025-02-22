import java.util.Scanner;
class SquareCube{
	public static void main(String[]args){
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		no = sc.nextInt();
		System.out.println("The Number is:"+ no);
		System.out.println("The Square is:"+ no*no);
		System.out.println("The Cube is: "+ no*no*no);	
	}

}