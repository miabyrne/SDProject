//Mia Byrne//
public class Exercise7{
  public static void main(String[] args){
	int[] x = {5, 8, 13, 16, 87, 98, 43, 65, 49, 75};

  	int first = x[0];
  	int last = x[x.length - 1];

  public int [] reorganize(int [] numbers){
	   Random rnd = new Random();
	   for (int i = numbers.length - 1; >= 0; i--)[
	   	int index = rnd.nextInt(i + 1);
	   	int a = numbers[index];
	   	numbers[index] = numbers[i];
	   	numbers[i] = a;
   }
   System.out.println("Reorganised Array: ");
   return numbers;

   System.out.println("First Value: "+first);
   System.out.println("Last Value: "+last);


  }
}

