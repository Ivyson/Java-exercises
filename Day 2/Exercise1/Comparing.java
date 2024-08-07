package Exercise1;
import java.util.*;
public class Comparing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String string2 = scanner.nextLine();
        System.out.println(string1.compareTo(string2));
        //for string1 = Sam, and string2 = Samukelo, string2 is greater than string1 with reference to number of characters in a string, hence should return a greater integer
        if(string1.compareTo(string2) == 0 ){
            System.out.println("The Strings entered are the same! Yay!");
        }
        else if(string1.compareTo(string2) > 1){
            System.out.println("The first entered string is greater than the string  entered secondly!");
        }
        else{
            System.out.println("The second string is greater than the first string!");
        }
        scanner.close();
    }
}
