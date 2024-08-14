import java.util.Scanner;
public class Settings {
    public Settings(){
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.printf("What operation do you want to perform\n[1].Fibonacci sequence\n[2]. Factorials\n");
    int option = scanner.nextInt();
    switch (option) {
        case 1:
        System.out.println();
        System.out.printf("Enter the number of terms that you are looking for:");
        int num_terms = scanner.nextInt();
        System.out.printf("\n Enter the first term:");
        int first_term = scanner.nextInt();
        System.out.printf("\n Enter the second term:");
        int second_term = scanner.nextInt();
        System.out.printf("%d, %d,", first_term, second_term);
        Fibonacci(second_term, first_term, num_terms);
        
            break;
        case 2:
        System.out.println();
        System.out.printf("You are trying to find the factorial of:");
        int number = scanner.nextInt();
        int update = Factorial(number);
        if(update < 0){
            System.out.println("There was a problem parsing your Factorial");
        }
        else{
            System.out.printf("\nThe Factorial of %d is: %d", number, Factorial(number));
        }
            break;
        default:
            break;
    }
    scanner.close();
    }
    public void Fibonacci(int second_term, int first_term, int num_terms){
    //Try Fibonacci sequence //Try Fibonacci sequence
        int current_term = second_term + first_term;
        first_term = second_term;
        second_term = current_term;
        System.out.printf("%d,", second_term);
        num_terms--;
        if(num_terms <= 0){
            return;
        }
        Fibonacci(second_term, first_term, num_terms);
    }
    public int Factorial(int number){
        
        if(number == 0 || number == 1){
            return 1;
        }
        else if(number < 0){
            // System.out.println();
            System.out.println("The factorial of a negative value does not exist!");
            return -1;
        }
        else if(number > 0){
            int update = number*Factorial(number-1);
            return update;
        }
        return -1;
    }
}
