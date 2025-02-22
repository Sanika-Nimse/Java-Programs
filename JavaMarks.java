import java.util.Scanner;
class JavaMarks{
	public static void main(String[]args){
		int core,advance;
		Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Core java Marks");
		core=sc.nextInt();
		System.out.println("Enter the advance java Marks");
		advance=sc.nextInt();
		
		System.out.println("Core Java Marks :"+ core );
		System.out.println("Advance Java Marks:"+ advance);
		System.out.println("Average :"+( core+advance/2));
		
		


	}



}
