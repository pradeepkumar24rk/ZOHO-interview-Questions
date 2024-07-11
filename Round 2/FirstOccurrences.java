// 33.
public class FirstOccurrences {

    public static String subString(String str, int startingIndex, int endingIndex) {
        String s = "";
        for (int i = startingIndex; i <= endingIndex; i++) {
            s += str.charAt(i) + "";
        }
        return s;
    }

    public static void main(String[] args) {
        String s1 = "ZOHOCORPORATION", s2 = "PORT";
        int n2 = s2.length(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n2; i++) {
            int val = s1.indexOf(s2.charAt(i) + "");
            if (val <= min)
                min = val;
            if (val >= max)
                max = val;
        }
        System.out.println(min + " " + max);
        System.out.println(subString(s1, min, max));
    }
}

// Input:
// s1 = "ZOHOCORPORATION"
// s2 = "PORT"

// Output:
// OHOCORPORAT

// Explaination:
// The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest
// range is 1 – 11.
// So print the characters of the first string in this inex range i.e.
// OHOCORPORAT