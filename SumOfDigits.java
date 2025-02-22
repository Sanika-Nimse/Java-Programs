//Write a program to accept a  number and print sum of its digits

import java.util.Scanner;

class SumOfDigits{
	public static void main(String[]args){
	int no;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	no = sc.nextInt();
	int sum=0;
	while(no>0){
		int d = no % 10;
            	sum += d;
            	no= no/10;

	}
	System.out.println("Sum of digit is:"+sum);
	

	}




}