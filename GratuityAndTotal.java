// This program computes the gratuity and total of userinput

import java.util.Scanner;
    public class GratuityAndTotal{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("Hey There, welcome to computation center, kindly tell us your SUBTOTAL:");
double subtotal = input.nextDouble();


System.out.println("kindly let us know your GRATUITY");
double gratuityRate = input.nextDouble();

System.out.println("\n computing....\n ");
System.out.println("dont leave or close page.....\n ");

double gratuity = subtotal * gratuityRate;
double total = gratuity + subtotal;

System.out.printf("your gratuity rate is: $%f  \n Your total is $%f: \n  \n", gratuity, total);

//System.out,print("your gratuity rate is: " + subtotal * gratuity "\n Your total is: " +  (gratuity * subtotal) + subtotal);

}
}
