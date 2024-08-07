package Exercise3;

import java.util.Random;

// import java.ut
public class RandomSentence {
    public static void main(String[] args){
        //Define the different arrays
        Random random = new Random();

        int index = 4;
        String[] article = {"the", "a", "one", "some","any"};
        String[] noun = {"boy", "girl","dog","town","car"};
        String[] verb = {"drove","jumped", "ran","walked","skipped"};
        String[] prepopsition = {"to","from","over","under","on"};
        System.out.println();
        for(int i = 0; i < 20; i++){
            String sentenceString = article[random.nextInt(index)]+" "+noun[random.nextInt(index)]+" "+verb[random.nextInt(index)]+" "+prepopsition[random.nextInt(index)]+" "+article[random.nextInt(index)]+" "+noun[random.nextInt(index)];
            System.out.println(sentenceString.substring(0,1).toUpperCase()+sentenceString.substring(1));            
        }
    }
}
