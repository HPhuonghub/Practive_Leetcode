package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));

        int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1));
    }

    //O(n), O(1)
    static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
