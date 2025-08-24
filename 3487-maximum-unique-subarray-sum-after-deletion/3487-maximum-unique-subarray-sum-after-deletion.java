class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        if(list.size() == 1)
            return list.get(0);   
        int sum = 0;
        int negCount = 0;
        int posCount = 0;
        Collections.sort(list);
        List<Integer> negList = new ArrayList<>(set);
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 0) {
                sum+=list.get(i);
                posCount++;
            } 
            else {
                negList.add(list.get(i));
            }
        }
        if(posCount > 0)
            return sum;
        else {
            return negList.get(negList.size() - 1);
        }
    }
}