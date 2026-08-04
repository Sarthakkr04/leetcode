class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        Arrays.sort(arr);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                ans.add(j);
            }
        }

        return ans;
    }
}