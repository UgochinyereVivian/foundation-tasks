//This code tells number which are in range or out of the specified range

import java.util.Scanner;
    public class NumbersInRange{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.print("Hey There, Enter a number \n");
int number = input.nextInt();

System.out.print("result loading....... \n");

if (number >=1 && number <= 100)
System.out.print("the number is In range");

else
System.out.print("this number is Out of range");

}

 }
