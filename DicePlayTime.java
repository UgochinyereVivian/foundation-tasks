import java.util.Scanner;
    public class DicePlayTime{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("Welcome to GardenPark play house! It is dice fun time!🥳️🤑️🥸️🤠️ \n \n");

System.out.println("Type your GAMING NAME?");
String name = input.nextLine();


System.out.println(name + " you're playing against WIZARDOFOZ🥸️, REDCLOWN🤡️ AND ALHAJIJOJO😏️ ! \n \n");

System.out.println(name + " WE ARE INTRODUCING YOU TO THE DICE! woohohh! \n ");

System.out.println("***********");
System.out.println("** 1 d   **");
System.out.println("**   d  2**");
System.out.println("**3  i   **");
System.out.println("**   c  4**");
System.out.println("**5  e   **");
System.out.println("**   6   **");
System.out.println("**rollnow**\n");

System.out.println(name + " rules of the game! pick a number 1,4,5,3,2,6, ready? lets go! \n");
int firstDie = input.nextInt();

System.out.println(name + " SECOND ROLLING! pick a number 1,4,5,3,2,6, ready? lets go! \n");
int secondDie = input.nextInt();

if(firstDie == 1 || secondDie == 1)
System.out.println(name + " FIRST ROLL: you rolled and got 4 \n wohoo! good game 🤑️");

if(firstDie == 4 || secondDie == 4)
System.out.println(name + " you rolled and got 1 \n go harder next time! 😑️");

if(firstDie == 6 || secondDie == 6)
System.out.println(name + " you rolled and got 3 \n rooting for you! 😋️");

if(firstDie == 3 || secondDie == 3)
System.out.println(name + " you rolled and got 6 \n you are a game king!! 💥️");

if(firstDie == 2 || secondDie == 2)
System.out.println(name + " you rolled and got 5\n go harder next time!");

else System.out.println ("Invalid dice number, try again and follow the rules whimp!");

System.out.print("total:" + firstDie + secondDie);

}


}
