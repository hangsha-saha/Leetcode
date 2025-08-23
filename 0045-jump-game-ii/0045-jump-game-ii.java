class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) 
            return 0;

        int maxJ = nums[0];
        int step = nums[0];
        int jump = 1;

        for (int i = 1; i < n - 1; i++) {
            maxJ = Math.max(maxJ, i + nums[i]);

            if (i == step) {
                jump++;
                step = maxJ;
            }
        }

        return jump;
    }
}
