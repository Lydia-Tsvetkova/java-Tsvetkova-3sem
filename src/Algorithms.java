import java.util.Arrays;
import java.util.LinkedList;

public class Algorithms {

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];

        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int p = 2; p <= n; ++p) {
            if (!prime[p])
                continue;

            for (int k = 2; p * k <= n; ++k)
                prime[p * k] = false;
        }

        return prime;
    }

    public static int[] primes(int n) {
        boolean[] s = Algorithms.sieveOfEratosthenes(n);
        int cnt = 0;
        for (boolean b : s) {
            if (b)
                ++cnt;
        }

        int[] res = new int[cnt];
        int len = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i]) {
                res[len] = i;
                ++len;
            }
        }

        return res;

    }

    public static int[][] primeFactors(int n) {


        LinkedList<int[]> resList = new LinkedList<int[]>();
        int[] ps = primes(n / 2);

        // resList.add(new int[] {1, 200});
        for (int d : ps) {
            // System.out.println(d);
            int pow = 0;
            while (n % d == 0) {
                ++pow;
                n /= d;
            }
            if (pow != 0) {
                resList.add(new int[]{d, pow});
            }
        }

        if (n != 1)
            resList.add(new int[]{n, 1});

        int[][] res = new int[resList.size()][2];
        int i = 0;
        for (int[] p : resList) {
            res[i] = p;
            ++i;
        }

        return res;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean[] s25 = Algorithms.sieveOfEratosthenes(100);
        for (int i = 0; i < s25.length; i++) {
            if (s25[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        int[] p25 = Algorithms.primes(100);
        for (int j : p25) {
            System.out.print(j + " ");

        }
        System.out.println();

        int[][] pfs = Algorithms.primeFactors(56);
        for (int[] pair : pfs) {
            System.out.printf("%d %d\n", pair[0], pair[1]);
        }
    }

}
