import java.util.zip.CheckedOutputStream;

public class WordCountFinderService {
    private String sentence;
    private String word;

    public WordCountFinderService(String sentence, String word) {
        this.sentence = sentence;
        this.word = word;
    }

    public int findCount(){
        int count = 0;
        int index = 0;

        while(true){
            index = sentence.indexOf(word,index);
            if (index == -1){
                break;
            }else{
                count++;
                index++;
            }
        }

        return count;
    }
}


