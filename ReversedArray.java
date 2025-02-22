//Write a program for reverse Array

class ReverseArray{
	public static void main(String[]args){
		int[] numbers ={1,2,3,4,5,6,7,8};
			System.out.println("Original Array:-");
		for(int num: numbers){
			System.out.println(num+" ");
		
		}
			System.out.println("\n Reversed array:-");

		for(int i= numbers.length-1; i>=0; i--){
			 System.out.print(numbers[i] + " ");
		}

	}




}







