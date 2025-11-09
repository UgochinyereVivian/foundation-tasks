import java.util.Scanner;
    public class ComputingBmi{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);
final double INCHES_DIVISION_CONSTANT = 703;

System.out.println("❤️‍🩹️welcome to Chopzie Home of Healthcare, we see you and we care for you!❤️‍🩹️ \n ");

System.out.println("may we know your name?");
String name = input.nextLine();

System.out.println("Now lets get to know to know you beyond your name \n ");

System.out.println("Enter your weight in pounds (eg, 60)");
double weight = input.nextDouble();

System.out.println("Enter your height in inches (17)");
double height = input.nextDouble();

double WeightinMetric = 703 * weight;
double heightMetric = height * height;
double heightSquare = WeightinMetric/heightMetric;

System.out.printf("BMI is %f:", heightSquare);

}
}
