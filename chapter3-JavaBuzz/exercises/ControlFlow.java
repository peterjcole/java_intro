// what imports will you need?
import java.util.Scanner;

public class ControlFlow {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String input;
      System.out.print("Enter a number or exit\n");

      input = scanner.nextLine();  // Read user input

      while(input != "exit") {
        try {
          int x = Integer.parseInt(input); 
          if(x % 2 == 0) {
            System.out.println("Even");
          } else {
            System.out.println("Odd");
          }
          // You can use this method to convert String to int, But if input 
          //is not an int  value then this will throws NumberFormatException. 
        } catch(NumberFormatException e) {
          if(input.equals("exit")) {
            System.out.println("Goodbye!"); 
            System.exit(0);
          } else {
            System.out.println("That's not a number!"); 
          }
          // Here catch NumberFormatException
          // So input is not a int.
        } 
        System.out.print("Enter a number or exit\n");
        input = scanner.nextLine();  // Read user input
      }



    }
  }

}
// can you remember how to set up your main function?

// find a way to read in user input

// write a method that will check if a number is odd or even
// (assume user only ever enters integers)

// print the answer to the console
