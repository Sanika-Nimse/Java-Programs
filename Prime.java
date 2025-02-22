import java.util.Scanner;

class Prime{
	
	public void prime(int no){
		boolean flag =true;
		for(int i=2;i<no;i++){
			if(no%i==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.print(no+" ");
		}
		//else{
			//System.out.println("The Number is Not Prime");
	
		//}
	}	

	public static void main(String[]args){
		//int no;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter any number");
		//no= sc.nextInt();
		Prime p1 = new Prime();
		//for(int no=2;no<100;no++){
			//p1.prime(no);
		//}
		int[]a ={34,55,45,67,1,0,11,89};
		for(int i=0;i<a.length;i++){
			p1.prime(a[i]);
		}


	}
}