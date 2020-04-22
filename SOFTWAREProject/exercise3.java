//Mia Byrne//
import java.util.Scanner;

public class exercise3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int num = 0;

    System.out.println("Enter a Number: ");
	num = input.nextInt();

    	if(num > 19){
		System.out.println("Number entered is greater than my age");
	}else if(num < 19){
		System.out.println("Number entered is less than my age");
	}else{
		System.out.println("Number entered is equal to my age");
           }


   }
}