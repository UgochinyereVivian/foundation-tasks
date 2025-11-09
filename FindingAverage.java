

import java.util.Scanner;

    public class FindingAverage{
    public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int numberOne;
int numberTwo;
int numberThree;
int total;
int average;

    System.out.print("Hey There, enter a whole number: ");
 numberOne = scanner.nextInt();

    System.out.print("Enter your second whole number: ");
 numberTwo = scanner.nextInt();

    System.out.print("Enter your third number: ");
 numberThree = scanner.nextInt();

    total = numberOne + numberTwo + numberThree;
    average = total/3;

System.out.printf("The total is: %d and %n the average is: %d. %n Weldone!", total, average);
//System.out.printf("The total is: %d and %n the average is: %d. %n Goodjob!", numberOne + numberTwo + numberThree, (numberOne + numberTwo + numberThree) / 3);

       }
    
    }
