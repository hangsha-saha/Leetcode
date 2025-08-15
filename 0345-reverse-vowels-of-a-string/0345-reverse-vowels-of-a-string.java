class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int j = s.length()-1;

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (isVowel(ch)) {
                while(j>i) {
                    char ch2 = arr[j];
                    if (isVowel(ch2)) {
                        char temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
