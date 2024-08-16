# Day 4 Lecture Recursive Functions

## Outline Of Today's lecture 
 - Basic concept of Recursive Functions
 - Writing and using Recursive Functions
 - Determine the <b> Base Case </b> and Recursion steps in a recursive algorithm
 - Understand the difference between Recursion functions and Iterations 
### Basic Concept of Recursive Functions
- Recursive method that calls itself inside the scope of itself.
    - If a Method calls itself within its scope, this is known to be a <b><i>Direct Recursion</i></b>
- The idea of recursive is to use one single code but multiple times, so we replicate a code multiple times until a specified requirement is met.
- An example of this function would be a <b><i>Fibonacci sequence & Factorial Function </i></b>
    - An Example of this method's operation is provided below using Java code:
    ```Java
    int recursive(int x)
    {
        if(x ==  0) //The if statement is a base case so that the recursive is not infinite
    {
        return;
    }
        recursive(x-1);
    }
    ```
    - The conditional check in the code is known as a <b><i> Base Case </i></b>
- The recursive Functions are much efficient for simple problems
- The main great example(Possibly could be in my Test, is a Fibbonacci series and Factorial problems)
       - Fibbonacci sequence describe the pattern of spiral shapes (Mostly in nature) 
    ```Java 
    //Fibonacci Series - a special type of sequence whereby the term n is the sum of (n-1)+(n-2)\
    // For fib = [0,1];
    //Fib[n] = fibonacci(n-1)+fibonacci(n-2);
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
## Similarities and Differences Between Recursive functions and iterations
- Both make use of a control statements, repitition and a termination test
```Java
for(int i = 0; i < 5; i++){
    //TO-DO CODE HERE.... As long as variable i is not 5, execute this code repetitively
}
```
```Java
    int fib(int n){
        return fib(n-1);
    }
```
<table>
<tr>
<th> </th>
<th>Recursion</th>
<th>Iteration</th>
</tr>
<tr>
<td>1. Control Statement</td>
<td>Uses ` if ` statements to terminate itself</td>
<td> the for loop and do-while loop has conditions in its function </td>
</tr>
<tr>
<td>2. Repitition </td>
<td>Implicit, the repition of the recursive function is only determined by the recursive call itself </td>
<td> Explicit </td>
</tr>
<tr>
<td>3. Termination test</td>
<td> Base Case reached </td>
<td> Explicit test/ Comparison </td>
</tr>
</table>

### Recursive Methods
- The Recursive functions are expensive for computation that has limited memory resource and requires limited processor time due to an allocation of resources everytime a function call is being created, in this instance, a stack of the process is constantly growing wider and potentially reaching a stack Over-flow, whereby the process is using more resourves than the allocated resources
- The Recursive functions are more prone to be an infinite recursion
- The Recursive functions are normally hard to debug, so it would be better to use iterations compared to recursions
- The Recursive functions are typically slower, so only use them when the time is not a factor and there is an abundance amount of memory!
### Iterative Methods
- Any functionality that can be solved using a recursive method can be solved using iteration
- Iterations do not allow a reallocation of resources every time the loop is being repeated, so it is reasonable for memory conservation and Processor time.
## Notes 
- Know how to implement recursive functions under a test condition, try out the provided examples and see if you can implement them and understand their functionalitites
- Know At least how to deal and manipulate big integer data type
