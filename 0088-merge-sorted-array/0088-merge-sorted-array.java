class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n]; 
        int  i = 0;
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        Arrays.sort(merged);
        for (i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
        }    
    }
}