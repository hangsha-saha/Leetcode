class Solution {
    public String binaryConvertion(int num) {
        return Integer.toBinaryString(num);
    }

    public int decimalConversion(String binaryStr) {
        return Integer.parseInt(binaryStr, 2);
    }

    public int findComplement(int num) {
        String binary = binaryConvertion(num);
        StringBuilder sb = new StringBuilder(binary);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0')
                sb.setCharAt(i, '1');
            else
                sb.setCharAt(i, '0');
        }

        return decimalConversion(sb.toString());
    }
}
