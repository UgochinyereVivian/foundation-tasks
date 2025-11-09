// This code is converting pounds to kilogram

import java.util.Scanner;
    public class PoundsToKilogram{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

final double KILOGRAM = 0.454;

System.out.println("Enter your weight in pounds (eg 150)");
double numInPounds = input.nextDouble();

double poundsToKilogram = numInPounds * 0.454;

System.out.print(poundsToKilogram);


}
 }
