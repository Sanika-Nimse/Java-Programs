//Break Integer

import java.util.Scanner; 

class BreakInteger{
	public void breakInteger(int no){
		String s1 =""+no;
		//s1= 2349005;
		int len = s1.length();
		int[] a= new int[len];
		int i=0;
		int d;
		while(no>0){
			d= no%d;
			a[i]=d;
			i++;
			no=no/10;

		}
		System.out.print(Arrays.toString(a));

	}
	public static void main(String[]args){
		BreakInteger b1= new BreakInteger();
		b1.breakInteger(2453678);	

	}

	
}