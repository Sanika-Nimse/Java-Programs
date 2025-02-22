//Write a java program to accept a number and print the sum of all digit which are divisible by 5

import java.util.Scanner;

class Sum{
	public static void main(String[]args){
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		no = sc.nextInt();
		int sum=0;
		while(no>0){
			int d = no % 10;
			if(d%5==0){
			sum = sum+ d;
			}
            		no= no/10;
		}
		System.out.println("The Sum of digit Divisible by 5:" + sum);
	}

}
