import java.util.Scanner;
    public class MilesToKilometers{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

final double KILOMETERS = 1.6;
double mile;

System.out.println("🚌️ 🚎️ enter your calculated miles from your house to sabo, lagos ");
mile = input.nextDouble();

double mileToKilo = KILOMETERS * mile;

System.out.println("🚏️ The Kilometers of is: " + mileToKilo);

}
}

