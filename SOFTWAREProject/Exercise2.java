//Mia Byrne//
import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args){


 	Scanner input = new Scanner(System.in);

 	int num1 = 0;
 	int num2 = 0;
 	int answer1 = 0;
 	int answer2 = 0;
 	int answer3 = 0;

 	System.out.println("Enter first number: ");
 	num1 = input.nextInt();
 	System.out.println("Enter second number ");
 	num2 = input.nextInt();

    answer1 = num1 + num2;
 	System.out.println("a. "+num1+" + "+num2+" = "+answer1);
 	answer2 = num1 - num2;
 	System.out.println("b. "+num1+" - "+num2+" =  "+answer2);
    answer3 = num1 * num2;
 	System.out.println("c. "+num1+" * "+num2+" = "+answer3);

   }
}