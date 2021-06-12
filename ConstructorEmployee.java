//constructor example
public class ConstructorEmployee {

   int empId;  
   String empName;  
	    
   //parameterized constructor with two parameters
   ConstructorEmployee(int id, String name){  
       this.empId = id;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){  
	ConstructorEmployee obj1 = new ConstructorEmployee(10245,"Chaitanya");  
	ConstructorEmployee obj2 = new ConstructorEmployee(92232,"Negan");  
	obj1.info();  
	obj2.info();  
   }  
}
