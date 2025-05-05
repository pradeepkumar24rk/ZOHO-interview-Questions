public class CompareVersion {
    public static int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int v1n = v1.length, v2n = v2.length;
        int n = v1n>v2n?v1n:v2n;
        int i=0;
        while(i<n) {
            int v1revision = i<v1n? Integer.parseInt(v1[i]):0;
            int v2revision = i<v2n? Integer.parseInt(v2[i]):0;
            if(v1revision<v2revision)
                return -1;
            else if(v1revision>v2revision)
                return 1;
            else
                i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        String v1 = "1.0";
        String v2 = "1.0.0.0";
        System.out.println(compareVersion(v1, v2));
    }
}
