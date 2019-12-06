package btu;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Generator implements GenerateText {
    private  Hashtable alphabet;
    private String language;
    private ArrayList parameters;
    private Random random;

    public Generator(String language, ArrayList parameters) {
        alphabet = new Hashtable();
        random = new Random();
        this.language = language;
        this.parameters = parameters;
    }

    @Override
    public void generateAlphabet() {
        alphabet.put("en", alphabet('a', 'z'));
        alphabet.put("ge", alphabet('ა', 'ჰ'));
        alphabet.put("ru", alphabet('а', 'я'));
    }

    public String alphabet(char starter, char ender){
        String alpha = "";
        for(int i=(int)starter; i<=(int)ender; i++){
            alpha += (char)i;
        }
        return alpha;
    }

    @Override
    public char generateChar() {
        String  symbols =  alphabet.get(language).toString();
        char symbol = symbols.charAt(random.nextInt(symbols.length()));
        return symbol;
    }

    @Override
    public String generateWord(int min, int max) {
        String word = "";
        int rand = random.nextInt(max-min+1)+min;
        for(int i=0; i<rand; i++){
            word += generateChar();
        }

        word += " ";

        return word;
    }

    @Override
    public String generateeSentenc(int min, int max) {
        String sentence = "";
        int rand = random.nextInt(max-min+1)+min;
        for(int i=0; i<rand; i++){
            sentence += generateWord((int) parameters.get(4), (int) parameters.get(5));
        }

        sentence += "    ";

        return sentence;
    }

    String main() {
        String res = "";

        int min = (int) parameters.get(0);
        int max = (int) parameters.get(1);
        int rand = random.nextInt(max-min+1)+min;
        for(int i=0; i<rand; i++){
            res += generateeSentenc((int) parameters.get(2), (int) parameters.get(3));
        }

        return res;
    }
}