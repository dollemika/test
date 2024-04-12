import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> words = new HashMap<>();
        readDictionary("dictionary.txt",words);
        ArrayList<String> t = translateFile("inputtext.txt",words);
        printTranslatedText("output.txt",t);
    }

    private static ArrayList<String> translateFile(String fname, HashMap<String, String> words) throws FileNotFoundException {
        Scanner read = new Scanner(new File(fname));
        ArrayList<String> result = new ArrayList<>();
        while (read.hasNext()){
            String x = read.next();
            result.add(words.getOrDefault(x, x));
        }
        return result;
    }

    public static void readDictionary(String fname,  HashMap<String,String> words) throws FileNotFoundException {
        Scanner read = new Scanner(new File(fname));
        while (read.hasNext()){
            String x = read.next();
            String y = read.next();
            words.put(x,y);
        }
        read.close();
    }
    public static void printTranslatedText(String fname, ArrayList<String> t) throws IOException {
        FileWriter writer = new FileWriter(fname, false);
        for (String i : t){
            writer.write(i+" ");
        }
        writer.close();
    }
}
