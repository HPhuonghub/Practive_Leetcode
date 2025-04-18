package leetcode;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String test1 = "ABCABC", test2 = "ABC";
        String test3 = "ABABAB", test4 = "ABAB";
        String test5 = "LEET", test6 = "CODE";

        System.out.println(gcdOfStringsversion1(test1, test2));
        System.out.println(gcdOfStringsversion1(test3, test4));
        System.out.println(gcdOfStringsversion1(test5, test6));


        System.out.println(gcdOfStringsversion2(test1, test2));
        System.out.println(gcdOfStringsversion2(test3, test4));
        System.out.println(gcdOfStringsversion2(test5, test6));
    }

    static boolean baseValid(String s1, String s2, int k) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 % k > 0 || l2 % k > 0) {
            return false;
        } else {
            String base = s1.substring(0, k);
            return s1.replace(base, "").isEmpty() && s2.replace(base, "").isEmpty();
        }
    }

    //O(min(m,n)*(m+n))
    static String gcdOfStringsversion1(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        for (int i = min; i > 0; i--) {
            if (baseValid(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }

        return "";
    }

    //O(m+n)
    static String gcdOfStringsversion2(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";

        int ucln = gcd(str1.length(), str2.length());
        return str1.substring(0, ucln);
    }

    static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
