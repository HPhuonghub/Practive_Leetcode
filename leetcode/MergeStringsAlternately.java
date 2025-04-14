package leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1, s2));

        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));

        String word3 = "abcd", word4 = "pq";
        System.out.println(mergeAlternately(word3, word4));
    }

    // O(Max(m,n)) with m = s1.length, n = s2.length
    static String mergeAlternately(String word1, String word2) {
        int len = Math.max(word1.length(), word2.length());
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(len > 0) {
            if(i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
            len--;
        }
        return sb.toString();
    }

    static String mergeAlternately2(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while(i < len1 || j < len2) {
            if(i < len1) {
                sb.append(word1.charAt(i++));
            }
            if(j < len2) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}
