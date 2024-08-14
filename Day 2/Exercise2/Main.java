package Exercise2;
import java.util.*;
public class Main{
    Main(){

    }
    public static void main(String[] args){
        //Compare portion of two strings and state if they are the sam
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String string1, string2;
        // int index;
        System.out.println("Enter the first string: ");
        string1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        string2 = scanner.nextLine();
        // scanner.nextLine();
        System.out.println("Enter the second string: ");
        index = scanner.nextInt();
        if(string1.regionMatches(0, string2, 0, 3)){
            System.out.println("The two strings are matching at the specified portion");
        }
        else{
            System.out.println("The two strings are not matching at the specified portion");   
        }
        scanner.close();
    }
}
