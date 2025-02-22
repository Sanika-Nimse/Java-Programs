// Addition of 2 matrix


import java.util.Scanner;
 
class MatrixSubtraction{
	public void acceptMatrix(int [][] m){
		System.out.println("\n Enter the elements of 3x3 matrix");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				m[i][j] = sc.nextInt();
			}
		}
	}

	public void print(int[][]a){
		System.out.println("\nEnter the elements of 3x3 matrix:\n ");

		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				System.out.printf("%5d",a[i][j]);
			}
				System.out.println();
		}
	}
	public void sub(int [][]a, int[][]b){

		int[][]c= new int[3][3];
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				c[i][j]=a[i][j]-b[i][j];
			}
		}
					print(c);

	}
		public static void main(String [] args){
		MatrixSubtraction m1 = new MatrixSubtraction();
		int [][] a = new int[3][3];
		int [][] b = new int[3][3];

		m1.acceptMatrix(a);
		m1.acceptMatrix(b);

		m1.print(a);
		m1.print(b);

		m1.sub(a,b);
	}
}