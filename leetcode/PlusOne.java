package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
//        Input: digits = [1,2,3]
//        Output: [1,2,4]
        int[] digits = new int[]{9,9};
        int[] result1 = plusOne(digits);
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }

        System.out.println();


//        Input: digits = [4,3,2,1]
//        Output: [4,3,2,2]

        int[] digits1 = new int[]{4,3,2,1};
        int[] result2 = plusOne(digits1);
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

        System.out.println();

        int[] digits2 = new int[]{9};
        int[] result3 = plusOne(digits2);
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + " ");
        }
    }

    static public int[] plusOne1(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < digits.length ; i++) {
            list.add(digits[i]);
        }

        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            int temp = 0;
            if(i == list.size() - 1) {
                temp = list.get(i) + 1;
                list.set(i, temp);
            } else {
                temp = list.get(i);
            }
            if(temp > 9 && i > 0) {
                list.set(i, list.get(i) % 10);
                list.set(i - 1, list.get(i - 1) + 1);
            }

            if(temp > 9 && i == 0) {
                list.set(i, list.get(i) % 10);
                list.add(0, 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
