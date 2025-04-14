package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        // nums = [2,7,11,15], target = 9
//        int [] nums1 = {2, 7, 11, 15};
//        int target1 = 9;
//        int[] result1 = twoSum1(nums1, target1);
//
//        System.out.print("Test 1: ");
//        for (int i = 0; i < result1.length; i++) {
//            System.out.print(result1[i] + " ");
//        }
//        System.out.println();

        // nums = [3,2,4], target = 6
//        int [] nums2 = {3,2,4};
//        int target2 = 6;
//        int[] result2 = twoSum1(nums2, target2);
//        System.out.print("Test 2: ");
//        for (int i = 0; i < result2.length; i++) {
//            System.out.print(result2[i] + " ");
//        }
//        System.out.println();

        // nums = [2,7,11,15], target = 9
        int [] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum2(nums1, target1);

        System.out.print("Test 1: ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
    }

    // O(n^2)
    static int[] twoSum1(int[] nums, int target) {
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // O(n)
    static int[] twoSum2(int[] nums, int target) {
        int l = nums.length;
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < l ; i++) {
            int result = target - nums[i];
            if(maps.containsKey(result)){
                return new int[]{maps.get(result), i};
            } else {
                maps.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

// 2,7,11,15], target = 9
// 9 - 2 = 7