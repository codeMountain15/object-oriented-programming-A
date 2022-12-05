// file name: For01.java
//

import java.util.Scanner;

class For01 {
  public static void main(String[] args) {

    Scanner inputObj = new Scanner(System.in);
    System.out.println("Enter the entity number");
    
    int num = inputObj.nextInt();
    
 for (int i = 1; i <= num; i++) {
       System.out.println("entity #" + i + " entered the game!");
    } // ends for loop
  } // ends main()
} // ends class Intro01
