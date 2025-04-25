package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //Input: strs = ["flower","flow","flight"]
        //Output: "fl"

        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));

        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs2));

        //["ab", "a"]
        String[] strs3 = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs3));

        //"flower","flower","flower","flower"
        String[] strs4 = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs4));

        //["reflower","flow","flight"]
        String[] strs5 = {"reflower","flow","flight"};
        System.out.println(longestCommonPrefix(strs5));
    }

//    static public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//        if (strs.length == 1) return strs[0];
//        String prefix = "";
//
//        int minLength = 201;
//        String strMinLength = "";
//
//        for (int i = 0; i < strs.length; i++) {
//            if (strs[i].length() < minLength) {
//                minLength = strs[i].length();
//                strMinLength = strs[i];
//            }
//        }
//
//        for (int i = 0; i < minLength; i++) {
//            String pre = strMinLength.substring(0, i + 1);
//            boolean check = true;
//            for (int j = 0; j < strs.length; j++) {
//                if (!pre.equals(strs[j].substring(0, i + 1))) {
//                    check = false;
//                }
//                if (!check) break;
//            }
//            if (!check) break;
//
//            prefix = pre;
//        }
//
//        return prefix;
//    }

//    static public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++) while (
//                strs[i].indexOf(prefix) != 0
//        ) {
//            prefix = prefix.substring(0, prefix.length() - 1);
//            if (prefix.isEmpty()) return "";
//        }
//        return prefix;
//    }



    static public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (
                        i == strs[j].length() || strs[j].charAt(i) != c
                ) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
