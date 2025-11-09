import java.util.Scanner;
    public class AreaOfATriangle{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("Enter a point of a triangle");
double pointOne = input.nextInt();

System.out.println("Enter another  point of a triangle");
double pointTwo = input.nextInt();

System.out.println("Enter another point of a triangle");
double pointThree = input.nextInt();

double sumOfPoints = (pointOne + pointTwo + pointThree)/2;
double findingarea = (sumOfPoints - pointOne) * (sumOfPoints - pointTwo) * (sumOfPoints - pointThree);
double area = findingarea * findingarea;

System.out.print(area);
}
 }
