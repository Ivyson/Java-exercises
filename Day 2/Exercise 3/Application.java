import java.util.*;
public class Application{
   
    Application(){
    }

    public static void main(String[] args){
        //Exercise 3 For random sentences , Exercise 16.5
        Application app = new Application();
        System.err.println(app);
        // int animal = 2;
        String[] article = {"the", "a", "one", "some","any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drive", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over" , "under", "on"};
        //Order of the sentence => article -> noun -> verb -> preposition -> article -> noun
        Random ran = new Random();
        
       //Construct 20 random sentences
       for(int i = 0; i < 20; i++){
        int x = ran.nextInt(4);
        String sentence = article[x]+" "+ noun[ran.nextInt(4)]+" "+verb[ran.nextInt(4)] +" "+preposition[ran.nextInt(4)]+" "+article[ran.nextInt(4)]+" "+noun[ran.nextInt(4)];
        // char[] article1 = sentence.toCharArray();
        // article1[0] = Character.toUpperCase(article1[0]);
        // String upper = String.valueOf(article[x].charAt(0));
        // String updateString = sentence.replaceFirst(article[x], article1.toString());
        // System.out.println("["+(i+1)+"]: "+updateString);
        String sentence2 = sentence.substring(0,1).toUpperCase()+sentence.substring(1);
        System.out.println("["+(i+1)+"]: "+sentence2);
       }
    }
}