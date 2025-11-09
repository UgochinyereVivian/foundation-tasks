
// *This code is calculating monthly interest rate of user

import java.util.Scanner;
    public class CalculateInterest{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("input balance");
double balance = input.nextDouble();

System.out.println("Enter your annual interest rate");
double interestRate = input.nextDouble();

double interest = balance * interestRate/1200;

System.out.print(interest);


}
 }
