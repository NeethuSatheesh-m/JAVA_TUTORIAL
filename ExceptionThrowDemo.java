//Exception Throw Example

public class ExceptionThrowDemo {
	static void canVote(int age){
		if(age<18)
            try{
                //throw a exception
                throw new Exception();
            }catch(Exception e){
                System.out.println("you are not an adult!");
            }
		else
		   System.out.println("you can vote!");
	}
	public static void main (String[] args) {
		canVote(20);
		canVote(10);
	}
}