class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int comp = target - numbers[i];
            if (map.containsKey(comp)) {
                res[0] = map.get(comp) + 1;
                res[1] = i + 1;
                return res;
            }
            map.put(numbers[i], i);
        }

        return res;
    }
}
