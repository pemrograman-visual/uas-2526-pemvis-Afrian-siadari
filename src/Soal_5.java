import java.util.*;
import java.lang.Math;

public class Soal_5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        n = Integer.parseInt(input.nextLine());
        double[] ipk = new double[n], pk = new double[n], tk = new double[n];
        String[] nm = new String[n];

        i = 0;
        for (i = 0; i <= n - 1; i++) {
            nm[i] = input.nextLine();
            ipk[i] = Double.parseDouble(input.nextLine());
            while (ipk[i] < 0.0 || ipk[i] > 4.0) {
                ipk[i] = Double.parseDouble(input.nextLine());
            }
            pk[i] = Double.parseDouble(input.nextLine());
            tk[i] = Double.parseDouble(input.nextLine());
            if (ipk[i] >= 3.0 && pk[i] <= 3000000 && tk[i] >= 3) {
                System.out.println(nm[i] + "Lolos");
            } else {
                System.out.println(nm[i] + "=Tidak Lolos");
            }
        }
    }
}
