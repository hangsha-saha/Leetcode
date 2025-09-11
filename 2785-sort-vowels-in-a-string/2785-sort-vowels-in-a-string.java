class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        // StringBuilder vowels = new StringBuilder();
        ArrayList<Character> vowels = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                vowels.add(s.charAt(i));
            }
        }

        Collections.sort(vowels);
        int j = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                sb.setCharAt(i, vowels.get(j));
                j++;
            }
        }
        return sb.toString();   
    }
}