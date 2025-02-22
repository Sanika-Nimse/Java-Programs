// write a program for a palindrome no in array Element

class PalindromeArray{
	public static void main(String[]args){
		int[] numbers = {1,2,3,2,1};
		boolean ispalindrome = true;
		for(int i=0; i<numbers.length/2 ; i++){
			if(numbers[i]!= numbers[numbers.length-1-i]){
				ispalindrome = false;
			break;
			}
		}
		
		if (ispalindrome) {
           		 System.out.println("The array is a palindrome.");        
		} 
		else{
            		System.out.println("The array is not a palindrome.");       
		 }

	}






}







