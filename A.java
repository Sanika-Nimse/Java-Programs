class A {
  void display() { 
      System.out.println("Class A"); 
 } 
} 
class B extends A { 
      void display() { 
            System.out.println("Class B");
  }
 } 
 public class Main { 
      public static void main(String[] args) { 
            A obj = new B(); 
           obj.display(); 
  } 
}  