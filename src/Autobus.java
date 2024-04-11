import java.util.Arrays;
import java.util.Scanner;

public class Autobus {
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        int[] lastI = new int[100];
        int[] max = new int[100];
        int totMax = 0;
        for (int i = 0; i<n; i++)
        {
            int x = read.nextInt();
            if (lastI[x] == 0)
                lastI[x] = i+1;
            else
                if (i+1-lastI[x]>max[x]){
                    max[x]=i+1-lastI[x];
                    lastI[x] = i+1;
                    if (max[x]>totMax)
                        totMax = max[x];
                }
        }
        System.out.println(totMax);
    }
}
