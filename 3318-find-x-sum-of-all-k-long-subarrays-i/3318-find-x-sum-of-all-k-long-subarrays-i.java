class Solution {

    private int find(Map<Integer, Integer> freqMap, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
        }

        int sum = 0;
        while (x-- > 0 && !pq.isEmpty()) {
            int[] top = pq.poll();
            int freq = top[0];
            int num = top[1];
            sum += num * freq;
        }

        return sum;
    }

    public int[] findXSum(int[] nums, int k, int x) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            freqMap.put(nums[r], freqMap.getOrDefault(nums[r], 0) + 1);

            while (l < r && (r - l + 1) > k) {
                freqMap.put(nums[l], freqMap.get(nums[l]) - 1);
                if (freqMap.get(nums[l]) == 0) {
                    freqMap.remove(nums[l]);
                }
                l++;
            }

            if ((r - l + 1) == k) {
                resultList.add(find(freqMap, x));
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}