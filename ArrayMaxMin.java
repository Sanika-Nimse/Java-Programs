// Write a code for min and max array using object class:-

import java.util.Scanner;

class ArrayMaxMin{

	int[]a;
	
	public void init(){
		a= new init[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(int i=0; i<10; i++){
			a[i] = sc.newInt();
		}
		
	}
	
	public int minOfArray(){
	
		int min = a[0];
		for(int i=0; i<10; i++){
			if(a[i] <min){
				min = a[i];
			}
		}


	return min;
	}

	public int maxOfArray(){
	
		int min = a[0];
		for(int i=0; i<10; i++){
			if(a[i] > max){
				max = a[i];
			}
		}


	return max;
	}

	public static void main(String[]args){
	ArrayMaxMin  a1 = new ArrayMaxMin();
	a1.init();
	
	System.out.println("The Min number is:-" + a1.minOfArray);
	System.out.println("The Max number is:-"+ a1.maxOfArray);

	}

}