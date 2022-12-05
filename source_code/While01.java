// file name: While01.java
//

import java.util.Scanner;

class While01 {
  public static void main(String[] args) {
    
    boolean repeat = true;
    Scanner inputObj = new Scanner(System.in);
    
    while (repeat){
        System.out.println("Enter W or V");
        char side = inputObj.next().charAt(0);
        
        switch (side) {
        case 'V':
          System.out.println("You chose Vampires");
          repeat = false;
          break;
        case 'W':
          System.out.println("You chose Werewolves");
          repeat = false;
          //break;
        }
    } // ends while loop
  }
}
