import java.util.Scanner;

    public class CollectingIntegers{
    public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int squareOne, squareTwo, dispertyOfSquare;
double sumSquare; 

    System.out.print("Hey There, Enter a whole number: ");
        int numberOne = scanner.nextInt();

System.out.print("Hey There, Enter a second whole number: ");
int numberTwo= scanner.nextInt();

squareOne = numberOne * numberOne;
squareTwo = numberTwo * numberTwo;

sumSquare = squareOne + squareTwo;
dispertyOfSquare = squareOne - squareTwo;

System.out.println("The sum of the squals is equal too: " + " " + sumSquare);

//System.out.printf("The square of numberOne is: %d %n the square of numberTwo is: %d %n The sum of the squares is %d %n The difference of both squares is: %d%n ",numberOne * numberOne, numberTwo * numberTwo, (numberOne * numberOne) + (numberTwo * numberTwo), (numberOne * numberOne) - (numberTwo * numberTwo));

//System.out.printf("The difference of the squares is %d : ", dispertyOfSquare);

}
} 
