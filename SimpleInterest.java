import java.util.Scanner;
class SimpleInterest{
	public static void main(String[]args){
		int p,n,r;
		Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Principle");
		p=sc.nextInt();
		System.out.println("Enter the no of year");
		n=sc.nextInt();
		System.out.println("Enter the rate of interest");
		r=sc.nextInt();
		
		System.out.println("The Princial  :"+ p );
		System.out.println("The No of Year:"+ n);
		System.out.println("The Rate  of Interest:"+ r);

		System.out.println("Simple Interest :"+( p*n*r/100));
		
		


	}



}
