package leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
//        Input: haystack = "sadbutsad", needle = "sad"
//        Output: 0
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(findFirstOccurrence(haystack, needle));

//        Input: haystack = "leetcode", needle = "leeto"
//        Output: -1
        String haystack1 = "leetcode", needle1 = "leeto";
        System.out.println(findFirstOccurrence(haystack1, needle1));
    }

    // O(n)
    static int findFirstOccurrence(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (haystack.length() < needle.length()) return -1;
        int lengthP = needle.length();

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.contains(needle) && haystack.charAt(i) == needle.charAt(0) && haystack.substring(i + 1, i + lengthP).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
