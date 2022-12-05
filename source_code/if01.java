// file name: if01.java
//

import java.util.Scanner;

class if01 {
  public static void main(String[] args) {
    Scanner inputObj = new Scanner(System.in);

    System.out.println("Enter your score:");
    int score = inputObj.nextInt();

    if (score < 5) {
      System.out.println("You failed...");
    } else if (score < 8) {
      System.out.println("Not bad!");
    } else {
      System.out.println("Exellent!");
    }
    
  }
}
