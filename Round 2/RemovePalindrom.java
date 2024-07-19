//116.
import java.util.Scanner;

public class RemovePalindrom {
    public static boolean ispalindrome(String a) {
        a = a.toLowerCase();
        // System.out.println(a);
        for(int i = 0,j = a.length()-1;i<j;i++,j--) {
            if(a.charAt(i)!=a.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("hello");
        String str = "Malayalam is my mother tongue",temp="",temp2 = "";
        int n = str.length();
        // String a[] = str.split(" ");
        // System.out.println(Armarays.toString(a));
        for(int i = 0;i<n;i++){
            // String temp2 = "";
            System.out.println(i);
            if(str.charAt(i) != ' ')
                temp2+=str.charAt(i);
            if(str.charAt(i) == ' ' || i==(n-1)) {
                System.out.println(temp2);
                if(!ispalindrome(temp2))
                    temp+=temp2+" ";
                temp2 = "";
            }
        }
        System.out.println(temp);
    }
}
