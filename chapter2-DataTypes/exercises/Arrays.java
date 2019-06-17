// can you remember how to set up your main function?
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class TehArrays {
  public static void main(String[] args) {
    String[] arr = { "meow", "meow", "I", "am", "a", "cat" };
    System.out.println(arr);
    for(String word: arr) {
      System.out.println(word);
    }

    Number[] num = {1.2, 3.4, 5.333};
    System.out.println(Arrays.toString(num));

    List<Number> arrayList = new ArrayList<>(Arrays.asList(1.2, 3.45, 2.6677));
    arrayList.add(2, 2.5127892);
    System.out.println(arrayList);
  }


}
// declare an array of Strings and print it

// declare an array of integers and print it

// declare an ArrayList of integers, add numbers to it, and then print it
