//factorial

import java.util.Scanner;

class Factorial{
	public static void main(String[]args){
		int no, f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		no = sc.nextInt();
		
		for(int i=1; i<=no; i++){
			f= f *i;
		}
			System.out.println("Factorial:-" + f);
		

	}



}

