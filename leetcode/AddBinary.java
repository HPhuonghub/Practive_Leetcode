package leetcode;

public class AddBinary {
    public static void main(String[] args) {
//        Example 1:
//        Input: a = "11", b = "1"
//        Output: "100"
        String a1 = "11", b1 = "1";
        System.out.println(addBinary(a1, b1));
//        Example 2:
//        Input: a = "1010", b = "1011"
//        Output: "10101"
        String a2 = "1010", b2 = "1011";
        System.out.println(addBinary(a2, b2));
    }

    static String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (aLen >= 0 || bLen >= 0 || carry == 1) {
            if (aLen >= 0) {
                carry += a.charAt(aLen--) - '0';
            }
            if (bLen >= 0) {
                carry += b.charAt(bLen--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }
}
