// Java program to demonstrate a List

import java.util.*;

public class ListInterfaceEx {
	public static void main(String[] args)
	{
		// Creating a list1
		List<Integer> list1 = new ArrayList<Integer>();

		// Adds 1 at 0 index
		list1.add(0, 10);

		// Adds 2 at 1 index
		list1.add(1, 20);
        list1.add(2,30);
		System.out.println("list 1  :"+list1);

		// Creating another list2
		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(1);
		list2.add(2);
		list2.add(3);
        System.out.println("list 2  :"+list2);
		// Will add list list2 from 1 index
		list1.addAll(1, list2);
		System.out.println("After adding list 2 to the index of list1   :"+list1);

		// Removes element from index 1
		list1.remove(1);
		System.out.println("After removing element from index 1     :"+list1);

		// Prints element at index 3
		System.out.println("Element on the index 3  :"+list1.get(3));

		// Replace 0th element with 5
		list1.set(0, 5);
		System.out.println("After replacing the 0th element with 5  :"+list1);

         // Using the Get method and the Iterative loop
        for (int i = 0; i < list1.size(); i++) {
  
            System.out.print(list1.get(i) + " ");
        }
  
        System.out.println();
  
        // Using the for each loop
        for (Integer str : list1)
            System.out.print(str + " ");
	}
}
