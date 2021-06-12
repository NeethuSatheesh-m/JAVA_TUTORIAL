import java.util.*;
//Super class: Calculation
class Calculation {
   int z;
	//method of Superclass
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("Sum   :"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("Difference    :"+z);
   }
}
// subclass : InheritanceCalculation
public class InheritanceCalculation extends Calculation {
    //nethod of subclass
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("Product:"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      //object creation
      InheritanceCalculation demo = new InheritanceCalculation();
      System.out.println("- - - Calculation of two number "+a+" and "+b+" - - -");
      //calling method in Class Calculation
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}