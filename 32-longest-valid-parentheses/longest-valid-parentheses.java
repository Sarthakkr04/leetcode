class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // base index for valid substrings
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);  // push index of '('
            } else {
                stack.pop();  // pop the matching '('
                if (stack.isEmpty()) {
                    stack.push(i);  // reset base index if unmatched ')'
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}