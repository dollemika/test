import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonWord {
    public static void main(String[] args)  throws FileNotFoundException {
        HashMap<String,Integer> words = new HashMap<>();
        readFile("inputtext.txt",words);
        String w = findWord(words);
        System.out.println(w);
    }
    public static void readFile(String fname,  HashMap<String,Integer> words) throws FileNotFoundException {
        Scanner read = new Scanner(new File(fname));
        while (read.hasNext()){
            String n = read.next();
            if (words.containsKey(n))
                words.put(n,words.get(n)+1);
            else
                words.put(n,1);
        }
        read.close();
    }
    public static String findWord(HashMap<String,Integer> words){
        String word = "", sentence = "";
        int max = 0;
        for (Map.Entry<String, Integer> pair : words.entrySet()){
            if (pair.getValue()>max){
                max = pair.getValue();
            }
        }
        for (Map.Entry<String, Integer> pair : words.entrySet()){
            if (pair.getValue()==max){
                word=pair.getKey();
                sentence=sentence.concat(" ");
                sentence=sentence.concat(word);
            }
        }
        return sentence;
    }
}




