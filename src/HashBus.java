import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashBus {
        public static void main(String[] args) {
            int n;
            Scanner read = new Scanner(System.in);
            n = read.nextInt();
            HashMap<String,Integer> lastI = new HashMap();
            HashMap<String,Integer>  max = new HashMap();
            int totMax = 0;
            for (int i = 0; i<n; i++)
            {
                String x = read.next();
                if(lastI.containsKey(x)){
                    if (i-lastI.get(x) > max.get(x)){
                        totMax = Math.max(totMax, (i - lastI.get(x)));
                        max.replace(x, i-lastI.get(x));
                        lastI.replace(x,i);
                        }
                    else
                        lastI.replace(x,i);

                }
                else {
                    lastI.put(x,i);
                    max.put(x,0);
                }
            }
            System.out.println(totMax);
        }
}
