// package Application;

/*
 * Author : Sam-
 * Date: 01 August 2024;
 * 
 */
import java.util.*;
public class Application{
    Application(){

    }
    public static void main(String[] args){
        //CompareTo Exercise, String exercise
        Scanner scanner = new Scanner(System.in);
        String string1,string2;
        System.out.println();
        System.out.printf("Enter Your first string: ");
        string1 = scanner.nextLine();
        System.out.printf("Enter Your second string: ");
        string2 = scanner.nextLine();
        //Compare the two strings and see if which one is greater than the other
        if(string1.compareTo(string2) == 0)//The two strings are equivalent, concerning the case(Uppercase/lowercASE)
        {
            System.out.println("The two inputted strings are the same");
        }
        else if(string1.compareTo(string1) > 0)// String 1 is more than string 2
        {
            System.out.println("The first entered string is greater than the second string lexicographically speaking");
        }
        else{
            System.out.println("The second string inputted is lexicographically greater thab the first entered string");
        }
        scanner.close();
    }
}