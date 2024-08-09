package Exercise2;
import java.util.*;
/*
 * 
 * Author : 
 * @param : true 
 * @return int
 */
public class Cportion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string1, string2;
        System.out.println();
        System.out.println("Enter the first String");
        string1 = scanner.nextLine();
        System.out.println("Enter the second String");
        string2 = scanner.nextLine();
        if(string1.toLowerCase().regionMatches(0, string2.toLowerCase(), 0, 3))
        {
            System.out.println("The two Strings have the same characters for the portion");
        }
        else{
            System.out.println("The two Strings are not sharing the portion which is the same");
        }
        scanner.close();
    }
}
