import java.util.*;

public class LinkedListEx {

	public static void main(String args[])
	{
		// Creating object of the
		// class linked list
		LinkedList<String> ll
			= new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("10");
		ll.add("20");
        ll.add("30");
        ll.add("40");
        ll.add("50");
        System.out.println("Linked list:    "+ll);
        //adding elements to the last of linked list
		ll.addLast("60");
        System.out.println("Linked list after adding last element:    "+ll);
		
        //adding elements to the first of linked list
        ll.addFirst("100");
        System.out.println("Linked list after adding first element:    "+ll);
		
        //adding elements at the second position
        ll.add(2, "140");
        System.out.println("Linked list after adding Second element:    "+ll);

		//Removing element 100
        ll.remove("100");
        System.out.println("Linked list after removing element 100 :    "+ll);
       
        //Removing element from 3 position
		ll.remove(3);
        System.out.println("Linked list after removing element from position 3 :    "+ll);
        //Removing  element from first 
		ll.removeFirst();
        System.out.println("Linked list after removing first element :    "+ll);
        //Removing last element
		ll.removeLast();
        System.out.println("Linked list after removing last element:    "+ll);

	}
}
