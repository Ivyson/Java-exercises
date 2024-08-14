import java.util.*;
public class Main{
    //Try Fibonacci sequence
    public static void Fibonacci(int second_term, int first_term, int num_terms){
       
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
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.printf("Enter the number of terms that you are looking for:");
        int num_terms = scanner.nextInt();
        System.out.printf("\n Enter the first term:");
        int first_term = scanner.nextInt();
        System.out.printf("\n Enter the second term:");
        int second_term = scanner.nextInt();
        System.out.printf("%d, %d,", first_term, second_term);
        Fibonacci(second_term, first_term, num_terms);
        scanner.close();
    }
}