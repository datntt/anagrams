import java.util.Scanner;

import static java.lang.System.*;

public class Task13_Anagrams {

  static boolean isAnagram(String a, String b) {
    // Complete the function
    // remove space
    String[] s1 = a.split("");
    String[] s2 = b.split("");
    // length other false;
    if (s1.length != s2.length) {
      return false;
    }
    sortArray(s1);
//    System.out.println(s1);
    sortArray(s2);
//    System.out.println(s2);
    // ignore lower and upper;
    for (int i = 0; i < s1.length; i++) {
      if (s1[i].compareToIgnoreCase(s2[i]) != 0) {
        return false;
      }
    }
    return true;
  }
  // this is method sort array.
  public static void  sortArray(String[] array) {
    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 0; j < array.length - 1 - i; j++) {
        if(array[j].compareToIgnoreCase(array[j + 1]) > 0 ) {
          String temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(in);
    String a = scan.nextLine();
    String b = scan.nextLine();
    scan.close();
    boolean ret = isAnagram(a, b);
    out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
