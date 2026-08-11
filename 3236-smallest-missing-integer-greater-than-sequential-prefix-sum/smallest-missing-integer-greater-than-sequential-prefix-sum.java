class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int j = 1; j < nums.length && nums[j] == nums[j - 1] + 1; j++) {
            sum += nums[j];
        }
        int m = 51;
        boolean[] st = new boolean[m];
        for (int x : nums) {
            st[x] = true;
        }
        while (sum < m && st[sum]) {
            sum++;
        }
        return sum;
    }
}