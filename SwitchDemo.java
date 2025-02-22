import java.util.Scanner;
class SwitchDemo{
	public static void main(String[]args){
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the TShirt Size:-");
		size= sc.nextInt();
		switch(size){
			case 38: System.out.println("Tshirt Size is S");
				 System.out.println("Price is Rs 300/-");
			break;		
			case 40:System.out.println("Tshirt Size is M");
				 System.out.println("Price is Rs 400/-");
			break;		
			case 42:System.out.println("Tshirt Size is L");
				 System.out.println("Price is Rs 600/-");
			break;		
			case 44:System.out.println("Tshirt Size is xxl");
				 System.out.println("Price is Rs 900/-");
			break;
			
			default:
				System.out.println("You're  Tshirt size is not available");
				 

		}

	}

}