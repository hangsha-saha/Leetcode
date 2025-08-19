class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long streak = 0;
        long k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                streak++;
            } else {
                k+=(streak * (streak + 1))/2;
                streak = 0;
            }
        }
        if(streak>0) {
            k+=(streak * (streak + 1))/2;
        }
        return k;
    }
}