class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            boolean selfdiv = true;

            while (num != 0) {
                int lastDigit = num % 10;

                if (lastDigit == 0 || i % lastDigit != 0) {
                    selfdiv = false;
                    break;
                }

                num /= 10;
            }

            if (selfdiv) al.add(i);
        }

        return al;
    }
}