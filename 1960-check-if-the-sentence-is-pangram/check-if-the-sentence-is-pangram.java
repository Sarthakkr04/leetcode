class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabets = new boolean[26];
        for (int i = 0; i < sentence.length(); ++i) {
            alphabets[sentence.charAt(i) - 'a'] = true;
        }
        for (boolean b : alphabets) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}