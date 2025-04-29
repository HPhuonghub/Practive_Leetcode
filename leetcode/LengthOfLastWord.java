package leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
//        Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord1(s1));

//        Input: s = "   fly me   to   the moon  "
//        Output: 4
//        Explanation: The last word is "moon" with length 4.
        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));
//        Input: s = "luffy is still joyboy"
//        Output: 6
//        Explanation: The last word is "joyboy" with length 6.
        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));
    }


    static public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    static public int lengthOfLastWord1(String s) {
        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }

        return length;
    }
}
