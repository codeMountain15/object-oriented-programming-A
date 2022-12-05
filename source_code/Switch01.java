// file name: Switch01.java
//

import java.util.Scanner;

class Switch01 {
  public static void main(String[] args) {
    Scanner inputObj = new Scanner(System.in);

    System.out.println("Enter W or V");
    char side = inputObj.next().charAt(0);
    
    switch (side) {
    case 'V':
      System.out.println("You chose Vampires");
      break;
    case 'W':
      System.out.println("You chose Werewolves");
      break;
    default:
      System.out.println("You chose 2 pitogyra m'apola");
    }
    
  }
}
