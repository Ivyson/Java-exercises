import java.io.File;
import java.util.*;
public class Code1{
    // void analyzePath(String path)
    // {
    //     File file = new File(path);
    //     if(file.exists()) //File exists if this returnd true
    //     {
    //         //Remember tenary  if  statements that uses question marks instead
    //         System.out.println("Your file does exist and it has a name"+file.getName()+"This ");
    //     }
    // }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter the path to your file (NB: use double forward slashes to indicate your file path) ");
        String filepath = scanner.nextLine(); //
        analyzePath(filepath);
        scanner.close();
    }
    public static void analyzePath(String path) //The static keyword is for allowing this method to be called without instantiating an object of a constructor
    {
        File file = new File(path);
        if(file.exists()) //File exists if this returnd true
        {
            //Remember tenary  if  statements that uses question marks instead of actual if statements number = number ? 1 : 2
            // bool state =path.isDirectory();
            System.out.println("Your path does exist and it has a name: " + file.getName() + 
                   " \nThis path is a " + (file.isDirectory() ? "Directory" : "File") + ".\n"+
                   "the path is "+(file.length())+" long\n"+
                   "The absolute path to this file is "+ file.getAbsolutePath());
        }
        else{
            System.out.println("The path was not found!!!");
        }
    }
}