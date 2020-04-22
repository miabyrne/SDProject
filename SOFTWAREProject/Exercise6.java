//Mia Byrne//
import java.util.Scanner;

public class Exercise6{
  public static void main(String[] args){


    Scanner input = new Scanner(System.in);

    String symbol = "";
    int counter = 1;
    int nested = 1;

	System.out.println("Enter a Symbol: "+symbol);
	symbol = input.next();
	System.out.println("Enter number of Rows: "+counter);
	counter = input.nextInt();
	System.out.println("Enter number of Columns: "+nested);
	nested = input.nextInt();
		while(counter <= "+counter){
		  while(nested <= "+nested){
		  System.out.print("+symbol);
		  

		    nested++;
		  }
		   nested = 1;
		   System.out.println();
		   counter++;
	}


   }
}