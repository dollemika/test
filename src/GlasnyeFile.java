import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class GlasnyeFile {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character,Integer> lastLetter = new HashMap();
        Scanner read = new Scanner(new File("inputnames.txt"));
        final String glasnye = "aeiouyAEIOUYаеёийыюяэоуАЕЁИЙЫЮЯЭОУ";
        while (read.hasNext()){
            String n = read.next();
            if (glasnye.indexOf(n.charAt(n.length()-1))>=0){
                char tmp = n.charAt(n.length()-1);
                if (lastLetter.containsKey(tmp)){
                    lastLetter.replace(tmp, lastLetter.get(tmp)+1);
                }
                else
                    lastLetter.put(tmp,1);
            }
        }
        read.close();
        System.out.println(lastLetter.keySet());
        System.out.println(lastLetter.values());
    }
}
