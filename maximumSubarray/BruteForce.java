class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int maximum = Integer.MIN_VALUE;
        //brute force
        //205 out of 210 test cases passed, time limit exceeded
        for(int i=0; i<len; i++) {
            int sum = 0;
            for(int j = i; j<len; j++) {
                sum += nums[j];
                if (sum > maximum) {
                    maximum = sum;
                }
            }
        }
        return maximum;
    }
}
