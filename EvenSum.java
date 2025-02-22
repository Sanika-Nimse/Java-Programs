//Write a program to print sum of all the even no from 1 to 100
import java.util.Scanner;
class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= no; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers up to" + no + ": " + sum);
    }
}