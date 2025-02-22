//Program to print Reverse of number
//9876
import java.util.Scanner;
class Reverse{
	public static void main(String[]args){
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		no = sc.nextInt();
		int rev=0,d;
		while(no>0){
			d=no%10;           //%operator always gives the last digit of the number
			rev= rev*10+d;     //*10 will increment 
			no = no/d;

		}
		System.out.println(no);
	}		

}
	