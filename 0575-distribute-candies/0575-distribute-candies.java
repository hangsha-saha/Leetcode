class Solution {
    public int distributeCandies(int[] candyType) {

        Set<Integer> unq = new HashSet<>();

        for(int i = 0; i < candyType.length; i++) {
            unq.add(candyType[i]);
        }
        return Math.min(unq.size(), candyType.length/2);
    }
}