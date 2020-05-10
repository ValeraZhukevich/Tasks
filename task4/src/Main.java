import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.print("Input a sentence: ");
            Scanner in = new Scanner(System.in);
            String sentence = in.nextLine().toLowerCase();
            System.out.print("Input a word: ");
            String word = in.nextLine().toLowerCase();
            WordCountFinderService wordCountFinderService = new WordCountFinderService(sentence, word);
            System.out.println("Quantity of mentions in sentence: " + wordCountFinderService.findCount());

        }
    }
}
