import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.print("Input a sentence: ");
            Scanner in = new Scanner(System.in);
            String sentence = in.nextLine();
            SentenceService sentenceService = new SentenceService(sentence);
            ArrayList<String> words = sentenceService.getListOfWorlds();
            System.out.println("Number of words: " + words.size());
            Collections.sort(words);
            for (String word : words){
                System.out.println(word);
            }
    }


}
    }
