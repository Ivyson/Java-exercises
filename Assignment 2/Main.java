import java.util.Scanner;
public class Main{
    public static int recursiveMultiply(int number1, int number2){
        if(number1 == 0 || number2 == 0) //Base case
        {
            return 0;
        }
        else if( number2 < 0)
        {
            return number1 + recursiveMultiply(number1, number2+1);
        }
        return number1 + recursiveMultiply(number1, number2-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("\nEnter the Second number : ");
        int number2 = scanner.nextInt();
        System.out.println("You are multiplying "+number1+" x "+number2);
        if(number1 < 0 && number2 < 0)
        {
            System.out.println("The result is: "+(-recursiveMultiply(number1, number2)));
        }
        else if(number2 < 0){
            System.out.println("The result is: "+(-recursiveMultiply(number1, number2)));
        }
        else{
            System.out.println("The result is: "+(recursiveMultiply(number1, number2)));
        }
        scanner.close();
    }
}