https://leetcode.com/problems/third-maximum-number/submissions/1158403875/
class Solution {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > one) {
                one = nums[i];
            }
        }

        for(int i : nums) {
            if (i>two && i < one) {
                two = i;
            }
        }

        boolean flag = false;
        for(int i : nums) {
            if (i>= three && i < two) {
                three = i;
                flag = true;
            }
        }

        if (flag) {
            return three;
        } else {
            return one;
        }

    }
}
