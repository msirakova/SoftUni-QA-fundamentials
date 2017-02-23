import java.util.Scanner;
public class ConsoleReader
{ 
  public static void main(String args[])
  {
       //taking value as command line argument.
        Scanner in = new Scanner(System.in); 
       System.out.printf("Enter i Value:  ");
       int i = in.nextInt();
       System.out.printf("Enter j Value:  ");
       int j = in.nextInt();
       int z;
    int sum = i + j +10;
    System.out.println("sum is "+sum);
    
    for (z=0; z<=1000; z++)
    	System.out.println(z);
           
      
   }
 }

