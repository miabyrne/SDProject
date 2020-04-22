//Mia Byrne//
import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
	
	int number = 0;

 	System.out.println("Enter a number from 1 to 10: ");
 	number = input.nextInt();

 	 	int counter = 1;
	        while(counter <= number){
	        	System.out.println(counter+" . Mia");
	        	counter = counter + 1;
        }

 				if((number > 10) && (number <= 0)){
						System.out.println("Number entered is invalid. Please try again.");
		}


   }
}