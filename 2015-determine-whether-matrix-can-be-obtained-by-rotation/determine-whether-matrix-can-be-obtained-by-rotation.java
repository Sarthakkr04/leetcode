class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int find = 0b1111;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    find &= ~0b0001;
                }
                if (mat[j][n - 1 - i] != target[i][j]) {
                    find &= ~0b0010;
                }
                if (mat[n - 1 - i][n - 1 - j] != target[i][j]) {
                    find &= ~0b0100;
                }
                if (mat[n - 1 - j][i] != target[i][j]) {
                    find &= ~0b1000;
                }
                if (find == 0) {
                    return false;
                }
            }
        }
        return find != 0;
    }
}