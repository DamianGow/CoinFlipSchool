import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	   public static void main(String[] args) {
		   String coinResults = "";
		   int flipTotal;
		   Scanner scnr = new Scanner(System.in);
		   
		   try {
		   System.out.println("Your current coin is silver, input 'y' to switch, otherwise, input anything else");
		   String switchChoice = scnr.next();
		   if (switchChoice.equals("y")) {
			   Game.switchCoin();
		   }
		   else if (switchChoice.equals("Egg")) {
			   Game.secret();
		   }
		   
		   System.out.println("Enter how many coinflips you would like to do, choosing 1 will show an image.");
		  
		   flipTotal =  scnr.nextInt();
		   
		   Game.flipMultiple(flipTotal);
		   } catch (InputMismatchException e) {
			   System.out.println("You inputted something incorrectly, please try again");
		   }
	   }
}
//test