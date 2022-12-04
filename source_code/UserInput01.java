// file name: UserInput01.java
//

import java.util.Scanner;

class UserInput01 {
  public static void main(String[] args) {
    Scanner inputObj = new Scanner(System.in);

    System.out.println("Enter your name, id and the grade:");

    // name input
    String name = inputObj.nextLine();

    // id input
    String id = inputObj.nextLine();
    int grade = inputObj.nextInt();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Grade: " + grade);
  }
}
