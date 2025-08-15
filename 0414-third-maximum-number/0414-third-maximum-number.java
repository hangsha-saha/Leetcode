class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        int[] intArr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(intArr);
        if(intArr.length < 3)
            return intArr[intArr.length-1];
        else
            return intArr[intArr.length - 3];
    }
}