// This program prompts the user to enter the minutes and displays the maximum number of years and remaining days for the minutes.

import java.util.Scanner;
    public class MinutesToYears{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);

System.out.println("Hey There👋️, enter a number of minutes (as much as you desire))");
int minutes = input.nextInt();

int years = minutes / 525600;
int remainingMins = (minutes - years * 525600);
int days = remainingMins / 1440;

System.out.printf("%d minutes is approximately %d and %d days ", minutes, years, days);

}
 }
