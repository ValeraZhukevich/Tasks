import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceService {
    private String sentence;
    ArrayList<String> words;

    public SentenceService(String sentence) {
        this.sentence = sentence;
        words = new ArrayList<>();
    }

    public ArrayList<String> getListOfWorlds(){
        String[] wordsArr = sentence.split(" ");
        for (int i = 0; i < wordsArr.length; i++){
            String word = wordsArr[i].replaceAll("[^a-zA-Z]", "");
            words.add(word.substring(0,1).toUpperCase() + word.substring(1));
        }
        return words;
    }
}
