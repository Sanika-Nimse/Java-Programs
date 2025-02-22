  //1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14

class Pattern{

	
	public void pattern(){
		int no=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
			System.out.printf("%5d",no);
			no++;
			}
		System.out.println();
		}
	}
	public void pattern2(){
		int no=1;
		for(int i=65;i<=69;i++){
			for(int j=65;j<=i;j++){
			System.out.printf("%4c",j);
			//no++;
			}
		System.out.println();
		}
	}



	public static void main(String[]args){
		Pattern p1 = new Pattern();
		p1.pattern();
		p1.pattern2();
	}



}