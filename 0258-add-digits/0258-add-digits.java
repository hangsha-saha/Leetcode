class Solution {

    public int processDigit(int n) {
        if(n>= 0 && n <= 9)
            return n;
        int temp = n;
        int sum = 0;
        while(temp != 0) {
            int rem = temp % 10;
            sum+=rem;
            temp = temp/10;
        }
        return processDigit(sum);
    }

    public int addDigits(int num) {
        return processDigit(num);
    }
}