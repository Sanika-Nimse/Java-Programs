//Divisible by 3
class WhileDemo1{
	public static void main(String[]args){
	int no =1;
	while(no<=30){
	if(no%3==0  && no%5==0)
	System.out.print("FizzBizz");
	else if(no%3==0)
	System.out.print("Fizz");
	else if(no%5==0)
	System.out.print("Bizz");
	else
	System.out.print(" "+no+" ");
		
		
		no++;

	}
	
	}


}