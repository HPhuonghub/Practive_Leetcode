package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println(romanToInt1(s1));
        System.out.println(romanToInt1(s2));
        System.out.println(romanToInt1(s3));

        System.out.println(romanToInt2(s1));
        System.out.println(romanToInt2(s2));
        System.out.println(romanToInt2(s3));
    }

    //OT = O(n) OS = 1
    static public int romanToInt1(String s) {
        int result = 0;
        int prev = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (map.containsKey(s.charAt(i))) {
                int x = map.get(s.charAt(i));
                if(x >= prev) {
                    result += x;
                } else {
                    result -= x;
                }
                prev = x;
            }
        }

        return result;
    }

    //OT = O(n) OS = 1
    static public int romanToInt2(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }
}
