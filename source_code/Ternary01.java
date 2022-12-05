// file name: Ternary01.java
//

import java.util.Scanner;

class Ternary01 {
  public static void main(String[] args) {
    Scanner inputObj = new Scanner(System.in);

    System.out.println("Enter W or V");
    char side = inputObj.next().charAt(0);

    String Side = (side == 'W') ? "Werewolves" : "Vampires";
    System.out.println("You chose: " + Side);
  }
}
