import java.util.*;
// Abstract class
abstract class Book {
    // Abstract method (does not have a body)
    public abstract void favBook();
    // Regular method
    public void author() {
      System.out.println("Author:J.K.Rowling");
    }
  }
  
  // Subclass (inherit from Book)
  class Fantasy extends Book {
    public void favBook() {
      // The body of favBook() is provided here
      System.out.println("My favourite book is Harry Potter");
    }
  }
  
  class AbstractMain {
    public static void main(String[] args) {
      Fantasy myBook = new Fantasy(); // Create a Fantasy object
      myBook.favBook();
      myBook.author();
    }
  }
  