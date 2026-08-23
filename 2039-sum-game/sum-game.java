class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

        for (int i = 0; i < n; i++) {
            if (num.charAt(i) == '?') {
                if (i < n / 2)
                    leftQ++;
                else
                    rightQ++;
            } else {
                int digit = num.charAt(i) - '0';

                if (i < n / 2)
                    leftSum += digit;
                else
                    rightSum += digit;
            }
        }

        if ((leftQ + rightQ) % 2 != 0)
            return true;

        return (leftSum - rightSum) * 2 != (rightQ - leftQ) * 9;
    }
}