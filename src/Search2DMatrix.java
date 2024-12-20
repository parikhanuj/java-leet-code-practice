class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                int left = 0;
                int right = matrix[i].length - 1;
                while (left <= right) {
                    if (matrix[i][left] == target)
                        return true;
                    if (matrix[i][right] == target)
                        return true;
                    if (matrix[i][right] - matrix[i][left] > target)
                        right--;
                    else
                        left++;
                }
            }
        }
        return false;
    }
}
