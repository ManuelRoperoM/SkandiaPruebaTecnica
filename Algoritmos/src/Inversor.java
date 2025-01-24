import java.util.ArrayList;
import java.util.List;

public class Inversor {
    static public void inversor(String frase) {
        List<String> listWord = split(frase);
        String reverseWord = "";
        for (int i = listWord.size()-1; i >= 0 ; i--) {
            reverseWord += listWord.get(i);
            reverseWord += " ";
        }
        System.out.println(reverseWord);
    }

    static public List<String> split(String frase) {
        String word = "";
        frase += " ";
        List<String> listWord = new ArrayList<>();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                word += frase.charAt(i);
            } else if (frase.charAt(i) == ' '){
                listWord.add(word);
                word = "";
            }
        }
        return listWord;
    }
}
