import java.util.Scanner;
    public class EggXactly{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("Hey There👋️, I'm botterfly🥰️, welcome to our eggs financial consultation center \n");

System.out.println("what can i adrress you with? (NAME)\n");
String name = input.nextLine();

System.out.println(name + " Lets get to business, how many eggs do you have? " + " \n");
int numberOfEggs = input.nextInt();

System.out.println("✍️processing....\n ");
System.out.println("almost done........\n \n ");

if(numberOfEggs <= 500){
System.out.println(name + " here is your dozen and remainder breakdown\n");
System.out.println("you have: " + numberOfEggs/12 + " dozens of egg \n Number of eggs left is: " + numberOfEggs%12);}

if (numberOfEggs > 500){

int currentNumber = numberOfEggs / 144;
System.out.println("your egg gross is: " + currentNumber + "\n the dozen is: " + (604 - 144 * currentNumber) /12 + "\n Remainder" + (604 - 144 * currentNumber) / 12 % 10);
}

}
}



