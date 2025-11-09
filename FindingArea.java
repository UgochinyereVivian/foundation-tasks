import java.util.Scanner;

    public class CircleArea{
    public static void main(String[]args){

flow double PI = 3.14159;
int radius;
double circumsference;
double diameter;


Scanner scanner = new Scanner(System.in);

  System.out.print("Hey There, enter a whole number to indicate a radius of a circle: ");
        radius = scanner.nextInt();

diameter = radius * radius;
area = radius * radius * 3.14159;
circumference = 2 * 3.14159 * radius;

System.out.printf("The area of the circle is: %d %n The circumference of the circle is %d %n the diameter of the circle is %d", area, diameter, circumference);

}

    }


