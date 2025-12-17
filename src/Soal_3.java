import java.util.*;
import java.lang.Math;

public class Soal_3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        n = Integer.parseInt(input.nextLine());
        String[] np = new String[n];
        int[] jp = new int[n];
        int[] k = new int[n];
        int total1;
        int totalk;

        total1 = 0;
        totalk = 0;
        i = 0;
        for (i = 0; i <= n - 1; i++) {
            np[i] = input.nextLine();
            jp[i] = Integer.parseInt(input.nextLine());
            for (i = 0; i <= jp[i] - 1; i++) {
                k[i] = Integer.parseInt(input.nextLine());
                while (k[i] < 0) {
                    System.out.println("INVALID");
                    k[i] = Integer.parseInt(input.nextLine());
                }
                total1 = total1 + k[i];
            }
            totalk = total1 + totalk;
        }
        for (i = 0; i <= n - 1; i++) {
            System.out.println(np[i] + "=" + total[i] + "wh");
        }
        System.out.println("Total konsumsi kamar =" + total + "wh");
        if (total > 10000) {
            System.out.println("Konsumsi diluar batas wajar");
        } else {
            System.out.println("Konsumsi masih dalam batas wajar");
        }
    }
}
