class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        int flag = 0;
        boolean flag2 = true;
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            String currWord = words[i];
            currWord = currWord.toLowerCase();
            String str = currWord.charAt(0)+"";
            flag2 = true;
            if(firstRow.contains(str)) {
                flag = 1;
            }  else if(secondRow.contains(str)) {
                flag = 2;
            } else {
                flag = 3;
            }
            for(int j = 1; j < currWord.length(); j++) {
                String ch = currWord.charAt(j)+"";
                if(flag == 1 && !firstRow.contains(ch)) {
                    flag2 = false;
                    break;
                } else if (flag == 2 && !secondRow.contains(ch)) {
                    flag2 = false;
                    break;
                } else if (flag == 3 && !thirdRow.contains(ch)) {
                    flag2 = false;
                    break;
                }
            }
            if(flag2) {
                list.add(words[i]);
            }
        }
        String[] array = list.toArray(new String[0]);
        return array;
    }
}