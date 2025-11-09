import java.util.Scanner;

    public class ComparingIntegers{
    public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int firstNumber; 
int square;

    System.out.print("Hey There, Enter a whole number: ");
        firstNumber = scanner.nextInt();

square = firstNumber * firstNumber;

if(firstNumber > 100 && square > 100) {
    System.out.printf("fistnumber %d and square: %d is greater than 100 ", firstNumber, square);
}

else if(firstNumber == 100 && square == 100) {
    System.out.printf("fistnumber %d and square: %d is equal 100 ", firstNumber, square);
}

//if(firstNumber != 100 && square != 100) {
    //System.out.printf("fistnumber %d and square: %d is not equal to 100", firstNumber, square);
//}

else{
    System.out.printf("fistnumber %d and square: %d is less than 100", firstNumber, square);
}

}
}
