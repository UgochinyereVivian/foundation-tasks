
import java.util.Scanner;

    public class Temperature{
    
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
        
 double kelvin;
 double celsius;
 double fahrenheit;

        System.out.print("Hey There! write temperature in kelvin");
           kelvin = scanner.nextDouble();

    celsius = kelvin - 273.15;
    fahrenheit = (kelvin -273.15) * 9/5 + 32;

System.out.printf("Kelvin is: %f %n Celsius is: %f %n Fahrenheit is: %f", kelvin, celsius, fahrenheit);

    }
 }
