import java.util.ArrayList;
import java.util.List;

public class PalindromeService {
    String sentenceOfNumbers;
    ArrayList<String> palindromes;

    public PalindromeService(String sentenceOfNumbers) {
        this.sentenceOfNumbers = sentenceOfNumbers;
    }

    public List<String> PalindromeService(String sentenceOfNumbers) {
        this.sentenceOfNumbers = sentenceOfNumbers;
        palindromes = new ArrayList<>();
        for (int i = 0; i < sentenceOfNumbers.length(); i++) {
            for (int j = i + 1; j <= sentenceOfNumbers.length(); j++) {
                if (ifPalindromes(sentenceOfNumbers.substring(i, j))) {
                    palindromes.add(sentenceOfNumbers.substring(i, j));
                }
            }
        }
        return palindromes;
    }

    private boolean ifPalindromes(String number){
        StringBuilder plain = new StringBuilder(number);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(number);
    }

}
