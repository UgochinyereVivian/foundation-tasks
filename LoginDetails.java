import java.util.Scanner;
    public class LoginDetails{
public static void main(String[]arags){

Scanner input = new Scanner(System.in);
String name = "Mbechi Ugochi";
String userName = "Ugochi";
int passWord = 87;

System.out.print("Hey " + name + " welcome your dating account,input your username");
String userNameTwo = input.nextLine();

System.out.print("Hey " + name + " Put in your password");
int pinCode = input.nextInt();

System.out.println("loading....... ");

if(userName == userNameTwo && passWord == pinCode){
System.out.println("login successful🎊️welcome to your dating account " + name);
System.out.println(name + "here is a suggestion of people that match your interst....");
System.out.println(name + "loading....rich kids");
System.out.println(name + "⚠️system glitches, check your network");
}

else
System.out.println("login unsucessful ");
System.out.println("do you want to change password?");

}
 }
