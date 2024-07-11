// 13.
public class XpatternWithWord {
    public static void main(String[] args) {
        String s = "PRADEEP";
        int n = s.length();
        for(int i = 1;i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                    System.out.print(i==j || j==((n+1)-i)?s.charAt(i-1): " ");
            }
            System.out.println();
        }
    }
}
// Intput
// PRADEEP           ##input should be old number length

//Output
// P     P
//  R   R
//   A A
//    D
//   E E
//  E   E
// P     P