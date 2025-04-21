package leetcode;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n1 = 1;
        int n2 = 2;
        System.out.println(canPlaceFlowers(flowerbed, n1));
        System.out.println(canPlaceFlowers(flowerbed, n2));
    }

    // TO = O(n), SO = O(1)
    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            //Check is not empty
            if (flowerbed[i] == 0) {
                boolean left = (i == 0 || flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}
