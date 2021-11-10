import java.util.Arrays;

public class ArraysTasks {

    public static int[] event(int[] a, int n) {
        int[] b = new int[n];
        int k = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (a[i] % 2 == 0) {
                b[k] = a[i];
                k++;
            }
        }
        int[] result = new int[0];
        for (int i = 0; i <= n - 1; i++) {
            if (b[i] == 0) {
                result = new int[i];
                System.arraycopy(b, 0, result, 0, i);
                return result;
            } else {
                result = b;
            }
        }
        return result;
    }

    public static boolean allSimilar(int[] a) {
        int length = a.length;
        if (length == 1) {
            return true;
        } else {
            for (int i = 0; i < length - 1; i++) {
                if (a[i] != a[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasSimilar(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            for (int k = i+1; k < length; k++) {
                if (a[i] == a[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double mean(int[] a) {
        int length = a.length;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += a[i];
        }
        return sum /= a.length;
    }

    public static int[] shift (int[] a) {
        int length = a.length;
        int[] b = new int[length];
        System.arraycopy(a, 1, b, 0, length - 1);
        System.arraycopy(a, 0, b, length - 1, 1);
        a = b;
        return a;
    }

    public static int[] copyShift (int[] a) {
        int length = a.length;
        int[] b = new int[length];
        System.arraycopy(a, 1, b, 0, length - 1);
        System.arraycopy(a, 0, b, length - 1, 1);
        return b;
    }

    public static void main(String[] args) {
        int[] b = {2, 4, 5, 7, 9, 10, 11};
        int[] c = {3, 1, 5, 7, 9, 13, 11};
        int[] result_a_1 = event(b, 4);
        int[] result_a_2 = event(b, 7);
        int[] result_a_3 = event(c, 5);
        System.out.println(Arrays.toString(result_a_1));
        System.out.println(Arrays.toString(result_a_2));
        System.out.println(Arrays.toString(result_a_3));
        int[] d = {1};
        int[] e = {1, 1, 1, 1, 1, 1};
        int[] f = {1, 1, 1, 2, 1, 1};
        Boolean result_b_1 = allSimilar(d);
        Boolean result_b_2 = allSimilar(e);
        Boolean result_b_3 = allSimilar(f);
        System.out.println(result_b_1);
        System.out.println(result_b_2);
        System.out.println(result_b_3);
        int[] g = {1, 2, 3, 4, 5, 6, 2};
        int[] h = {1, 2, 3, 4, 5, 6, 7};
        Boolean result_c_1 = hasSimilar(g);
        Boolean result_c_2 = hasSimilar(h);
        System.out.println(result_c_1);
        System.out.println(result_c_2);
        int[] i = {1, 2, 3, 4, 5};
        Double result_d_1 = mean(i);
        System.out.println(result_d_1);
        int[] j = {10, 20, 30, 40};
        int[] result_e_1 = shift(j);
        int[] result_f_1 = copyShift(j);
        System.out.println(Arrays.toString(result_e_1));
        System.out.println(Arrays.toString(result_f_1));
    }
}

