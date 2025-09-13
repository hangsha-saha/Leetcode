class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                if(vowel.containsKey(s.charAt(i))) {
                    vowel.put(s.charAt(i), vowel.get(s.charAt(i))+1 );
                } else {
                    vowel.put(s.charAt(i), 1 );
                }
            } else {
                if(consonant.containsKey(s.charAt(i))) {
                    consonant.put(s.charAt(i), consonant.get(s.charAt(i))+1 );
                } else {
                    consonant.put(s.charAt(i), 1 );
                }
            }
        }
        int maxV = 0, maxC = 0;

        if (!vowel.isEmpty())
            maxV = Collections.max(vowel.values());
        if (!consonant.isEmpty()) {
            maxC = Collections.max(consonant.values());
        }

        return maxV + maxC;
    }
}