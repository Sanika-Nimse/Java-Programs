import java.util.Scanner;
	class DoWhileLoop{
		public static void main(String[]args){
		int no=0;
		int sum=0;
		String opt;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter The Number:-");
			no = sc.nextInt();
			sum = sum+no;
			System.out.println("Do you want to add the number ? Yes /No");
			opt = sc.next();
		}
		while(opt.equals("Yes"));
		System.out.println("The Sum of all Entered Number is:- "+ sum);

		}


}