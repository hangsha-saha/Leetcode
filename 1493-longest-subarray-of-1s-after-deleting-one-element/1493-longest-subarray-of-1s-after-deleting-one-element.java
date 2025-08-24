class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int zCount = 0;
        int i = 0;
        int maxLength = 0;

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == 0) {
                zCount++;
            }
            if(zCount > 1) {
                if(nums[i] == 0)
                    zCount--;
                i++;
            }
            maxLength = Math.max(maxLength, j - i);
        }

        return maxLength;
    }
}