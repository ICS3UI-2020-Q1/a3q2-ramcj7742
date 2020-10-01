import java.util.Scanner;
/**
 * determines animal based on user answers
 * @author Jaden
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // asks user if animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();

    //check feather status
    if(featherAnswer.equals("yes")){
      System.out.println("Does the animal swim? (yes/no)");
      String swimAnswer = input.nextLine();

      //determines type of animal
      if(swimAnswer.equals("yes")){
        System.out.println("This is a duck");
      }else if(swimAnswer.equals("no")){
        System.out.println("This is a Hen");
      }
      //if animal doesnt have feathers
    }else if(featherAnswer.equals("no")){
      System.out.println("Does the animal have legs? (yes/no)");
      String legAnswer = input.nextLine();

      //determines type of animal
      if(legAnswer.equals("yes")){
        System.out.println("This is a Lizard");
      }else if(legAnswer.equals("no")){
        System.out.println("This is a Snake");
      }
    }
    
  }
}
