// Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;
    public class AdditionOfDigits{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("Hey There👋️, enter numbers between 0 - 1000 (e.g 67, 897, 1000)");
int numbers = input.nextInt();

int numberFour = numbers / 1000 % 10;
int numberThree = numbers/100 % 10;
int numberTwo = numbers/10%10;
int numberOne = numbers % 10;

if (numbers > 1000)
System.out.print("number exceeds digits limit, go again, dont be a whimp");
else
System.out.print(numberFour + numberThree + numberTwo +  numberOne);



//This part shows how it can be done using the if statement👇️this is a redundant but a working code

//if(numbers <=1000){
//numberFour = numbers / 1000 % 10;
//numberThree = numbers/100 % 10;
//numberTwo = numbers / 10 % 10;
//numberOne = numbers % 10;
//System.out.print(numberOne + numberTwo + numberThree + numberFour);
//}

//if (numbers >=100 && numbers <=999){
//numberThree = numbers/100 % 10;
//numberTwo = numbers / 10 % 10;
//numberOne = numbers % 10;
//System.out.print(numberOne + numberTwo + numberThree);
//}

//if (numbers >=0 && numbers <=99){
//numberOne = numbers % 10;
//System.out.print(numberOne);


//}

}
}
