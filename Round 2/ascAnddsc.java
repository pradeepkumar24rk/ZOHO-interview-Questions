public class ascAnddsc {
    public int[] solve(int[] n1, int[] n2) {
        int n = n1.length, m = n2.length;
        int[] result = new int[n + m];
        int k = 0;

        boolean asci = n1[0] < n1[n - 1];
        boolean ascj = n2[0] < n2[m - 1];

        int i = asci ? 0 : n - 1;
        int j = ascj ? 0 : m - 1;

        while (i >= 0 && i <= n - 1 && j >= 0 && j <= m - 1) {
            if (n1[i] < n2[j]) {
                result[k++] = n1[i];
                i = asci ? i + 1 : i - 1;
            } else {
                result[k++] = n2[j];
                j = ascj ? j + 1 : j - 1;
            }
        }

        while (i >= 0 && i <= n - 1) {
            result[k++] = n1[i];
            i = asci ? i + 1 : i - 1;
        }

        while (j >= 0 && j <= m - 1) {
            result[k++] = n2[j];
            j = ascj ? j + 1 : j - 1;
        }

        return result;
    }
}