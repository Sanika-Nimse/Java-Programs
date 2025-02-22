//Write a program for a palindrome number

import java.util.Scanner;

class Palindrome{
	public static void main(String[]args){
	int no;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	no = sc.nextInt();
	int temp = no;
	int d, rev=0;
	while(no>0){
		d=no%10;
		rev= rev*10+d;
		no=no/10;

	}
	if(rev==temp){
		System.out.println("The Number is Palindrome");

	}
	else{
		System.out.println("The Number is not Palindrome");
	}

	}





}