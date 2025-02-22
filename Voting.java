//Program to accept age and print whather you can vote or not
import java.util.Scanner;
class Voting{
	public static void main(String[]args){
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:-");
		age = sc.nextInt();
		if(age>=18){
			System.out.println("Do you have your Aadhar or Voter Card? Yes/No");
			String ch =sc.next();
			if(ch.equals("Yes")){
				System.out.println("You can Vote");
			}
			else{
				System.out.println("You cannot vote");
			}
			
			}
			else{
				System.out.println("You cannot vote");
			}



	}





}