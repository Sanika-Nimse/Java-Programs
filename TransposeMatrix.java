//two Dimensional array :- always located in contigous memory location
// transpose matrix
//Matrix
import java.util.Scanner;
 
class TransposeMatrix{
	public void acceptMatrix(int [][] m){
		System.out.println("Enter the elements of 3x3 matrix");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				m[i][j] = sc.nextInt();
			}
		}
	}
	public void printMatrix(int [][]m){
		System.out.println("\n The Given Matrix \n");
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				System.out.print(m[i][j]+" "); 
			}
			System.out.println();
		}
	}
	public void transposeMatrix(int [][]m){
		System.out.println("\n The Transpose Matrix is \n");
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				System.out.print(m[j][i]+" "); 
			}
			System.out.println();
		}
	}

	public static void main(String [] args){
		TransposeMatrix m1 = new TransposeMatrix();
		int [][] m = new int[3][3];
		m1.acceptMatrix(m);
		m1.printMatrix(m);
		m1.transposeMatrix(m);
	}
}