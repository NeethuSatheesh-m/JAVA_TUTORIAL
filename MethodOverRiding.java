class OverRiding{
    public void myMethod(){
     System.out.println("Overridden Method 1");
    }
 }
 public class MethodOverRiding extends OverRiding{
    
    //overWritten method
    public void myMethod(){
     System.out.println("Overriding Method 2");
    }
    public static void main(String args[]){
    // Class OverRiding  object and method call
     OverRiding obj1=new OverRiding();
     obj1.myMethod();
    //method is overwritten
    OverRiding obj2= new MethodOverRiding();
    obj2.myMethod();
    }
 }
 