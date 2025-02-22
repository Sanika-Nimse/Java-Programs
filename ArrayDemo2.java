class ArrayDemo2{
	public static void main(String[]args){
		int marks[]= {89,88,98,78,55,45,34};
		System.out.println("The size of Array:-" + marks.length);
		System.out.println("All Array Elements:");
		for( int i=0; i<marks.length; i++){
			System.out.println(marks[i]);
		}
		System.out.println("2nd element:"+ marks[1]);
		marks[1]=66;
		System.out.println("2nd element:"+ marks[1]);
		
		System.out.println("Array Element printing using each loop");
		for(int m: marks){
		System.out.println(m);
		}

	}




}