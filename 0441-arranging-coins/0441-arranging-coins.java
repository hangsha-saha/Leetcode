class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        int res = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins = (mid * (mid + 1)) / 2;
            if (coins == n) {
                return (int) mid;
            }
            if (coins < n) {
                res = (int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
