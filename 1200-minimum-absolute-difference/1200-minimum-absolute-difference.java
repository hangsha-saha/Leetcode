class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        
        List<Integer> x = new ArrayList<>();
        x.add(arr[0]);
        x.add(arr[1]);
        list.add(x);

        for (int i = 1; i < arr.length - 1; i++) {
            int d = arr[i + 1] - arr[i];
            if (d < diff) {
                diff = d;
                list.clear();
                List<Integer> newPair = new ArrayList<>();
                newPair.add(arr[i]);
                newPair.add(arr[i + 1]);
                list.add(newPair);
            } else if (d == diff) {
                List<Integer> newPair = new ArrayList<>();
                newPair.add(arr[i]);
                newPair.add(arr[i + 1]);
                list.add(newPair);
            }
        }
        return list;
    }
}
