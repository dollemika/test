import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        char[] flowers = new char[] {'G','C','V'};
        char x;
        int n;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        for (int i=0; i<n; i++)
        {
            x = flowers[1];
            flowers[1] = flowers[2];
            flowers[2] = x;

            x = flowers[1];
            flowers[1] = flowers[0];
            flowers[0] = x;
        }
        System.out.println(flowers);
    }
}
