import java.util.Scanner;
    public class Temperatureee{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.print("Hey There, type in the current temperature of your location in whole number (e.g 10, 9, 8)");
int temperature = input.nextInt();

System.out.print("Temperature result loading........\n");

if (temperature < 15)
System.out.println("The temperature is cold");

if (temperature >= 15 && temperature <= 30)
System.out.println("The temperature is warm");

else
System.out.print("The Temperature is hot");


}
  }
