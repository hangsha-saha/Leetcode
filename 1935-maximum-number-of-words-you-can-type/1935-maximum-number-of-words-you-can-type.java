class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        int flag = 0;
        String[] arr = text.split(" ");
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < brokenLetters.length(); i++) {
            list.add(brokenLetters.charAt(i));
        }

        for(int i = 0; i < arr.length; i++) {
            String curr = arr[i];
            for(int j = 0; j < curr.length(); j++) {
                if(list.contains(curr.charAt(j))) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                count++;
            }
            flag = 0;
        }

        return count;
    }
}