package leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(10));
    }

    static int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;

        int prev = 1, curr = 1;

        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }
}
