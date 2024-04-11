import java.util.Scanner;

public class SortTime {
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        int[][] m = new int[n][4];
        for (int i = 0; i < n; i++) {
            m[i][0] = read.nextInt();
            m[i][1] = read.nextInt();
            m[i][2] = read.nextInt();
            m[i][3] = m[i][2] + m[i][1] * 60 + m[i][0] * 60 * 60;
        }
        bubbleSortImproved(m,n);
        for (int i = 0; i < n; i++) {
            System.out.println(m[i][0]+" "+m[i][1]+" "+m[i][2]);
        }
    }
        public static void bubbleSortImproved(int[][] array, int n){
            int swapCounter;
            for (int i = 0; i < n-1; i++) {
                swapCounter=0;
                for (int j = 0; j < n-1-i; j++) {
                    if (array[j][3] > array[j+1][3])
                    {//поменять местами
                        int t = array[j][3];
                        array[j][3] = array[j+1][3];
                        array[j+1][3] = t;

                        t = array[j][0];
                        array[j][0] = array[j+1][0];
                        array[j+1][0] = t;
                        t = array[j][1];
                        array[j][1] = array[j+1][1];
                        array[j+1][1] = t;
                        t = array[j][2];
                        array[j][2] = array[j+1][2];
                        array[j+1][2] = t;

                        swapCounter++;
                    }
                }
                if (swapCounter == 0)
                    break;
            }
    }
}
