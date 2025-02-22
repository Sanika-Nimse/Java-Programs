// Write a Java program for Fibonacci Series
//the summation of cube of each digit is same as that number

import java.util.Scanner;

class Armstrong{
	public void armstrong(int no){
		int sum=0,d,temp;
		temp=no;
		while(no>0){
			d=no%10;
			sum= sum+d*d*d;
			no= no/10;
		}
		
		if(temp==sum){
			System.out.println("The number is Armstrong"+ temp);
		}
		//else{
			//System.out.println("The number is not Armstrong");

		}
	}
	public static void main(String[]args){
		//int no;
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the Number:-");
		//no= sc.nextInt();
		Armstrong a1 = new Armstrong();
		for(int no=100; no<=1000;no++){
			a1.armstrong(no);
		}
	}

}