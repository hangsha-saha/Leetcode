class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(nums[i]);
        } 

        for(int i = 0; i < list.size(); i++) {
            int comp = target - list.get(i);
            if(list.contains(comp) && i != list.indexOf(comp)) {
                int index = list.indexOf(comp);
                res[0] = i;
                res[1] = index;
                break;
            }
        }

        return res;
    }
}