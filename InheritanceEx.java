// Java program to illustrate the concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;
//Super class
class one {
	public void printSuper()
	{
		System.out.println("Super class");
	}
}
//Subclass
class two extends one {
	public void printSub() { System.out.println("SubClass"); }
}
// Driver class
public class InheritanceEx {
	public static void main(String[] args)
	{
        //creating object
		two g = new two();
		g.printSuper();
		g.printSub();
		g.printSuper();
	}
}
