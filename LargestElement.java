//Find the largest Element in array 

class LargestElement{
	public static void main(String[]args){
	int[] numbers ={12,66,77,90,67,34,98};
	int max = numbers[0];
	for(int number : numbers){
		if(number>max )	{
		max = number;
	        }
	}
	

	System.out.println("The Largest Number is:-"+ max);

	}





}