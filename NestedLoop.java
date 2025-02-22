//54321
//5432
//543
//54
//5



class NestedLoop{
	
	

	public void pattern2(){
		for(int i=1; i>=5; i--){
			for(int j=5; j<=i; j++){
				System.out.print(j);
			}

			System.out.println();
		}

	}

	public static void main(String[]args){
		NestedLoop d1 = new NestedLoop();
		d1.pattern2();
	}


}
