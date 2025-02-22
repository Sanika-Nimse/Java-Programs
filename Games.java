import java.util.Scanner;
class Games{
	public static void main(String[]args){
	String games;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Game Name:-");
	games=sc.next();
	switch(games){
		case"Cricket":System.out.println("M.S.Dhoni, Virat Kholi");
		break;
		case"Football":System.out.println("Messi, Ronaldo");
		break;
		case"Chess":System.out.println("Vishwananthan Anand, Gukesh,Magnus");
		break;
		case"Badminton":System.out.println("p.v.Sindhu");
		break;
		
		default:
		System.out.println("Thiss Games are not Available!!!");
		
		
	}

	}


}