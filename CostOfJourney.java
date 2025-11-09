import java.util.Scanner;
    public class CostOfJourney{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("Hey Car-Owner👋️, how many miles will you drive today?");
double miles = input.nextDouble();

System.out.println("how many miles will be covered for a gallon of fuel to be exhausted?");
double milesPerGallon = input.nextDouble();

System.out.println("how much is a gallon of fuel?");
double pricePerGallon = input.nextDouble();

double newmiles = (miles/milesPerGallon) * pricePerGallon;

System.out.print("$" + newmiles);

}
 }


