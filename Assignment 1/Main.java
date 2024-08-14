import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main{
    public static Pattern pattern;
    static Scanner scanner;

    static String[] inputting(){
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.printf("Enter a random sentence: ");
        String sentence = scanner.nextLine();
        return sentence.split(" ");
    }
    static void arrayfetch(String[] sentence){
        String match = "^[aeiou]";
        pattern = Pattern.compile(match);
        System.out.println("Matching Words are");
        System.out.println("******************************************************");
        int count = 0;
        for(String sentenceString : sentence)
        {
            Matcher matcher1 = pattern.matcher(sentenceString.toLowerCase());
            if (matcher1.find()) {
                String parsedString = "\n["+(count+1)+"] "+sentenceString.replaceFirst(matcher1.group(),matcher1.group().toUpperCase());
                System.out.printf("\n[%d] %s",(count+1),sentenceString.replaceFirst(matcher1.group(),matcher1.group().toUpperCase()));
                Fileprocessing(parsedString);
                count++;
            }
        }
        System.out.println("\n\n******************************************************");
    }
    static void Fileprocessing(String sentence){
        try {
            FileWriter file = new FileWriter("Example.txt",true);
            file.write(sentence);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    public static void main(String[] args){
        arrayfetch(inputting());
    }
}