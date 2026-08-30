class Solution {
    public int minimumDeletions(int[] arr) {
        int n = arr.length, min = 0, max = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[min]) min = i;
            if (arr[i] > arr[max]) max = i;
        }

        int l = Math.min(min, max);
        int r = Math.max(min, max);

        return Math.min(r + 1, Math.min(n - l, l + 1 + n - r));
    }
}