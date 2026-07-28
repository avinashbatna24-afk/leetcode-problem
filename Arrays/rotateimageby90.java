class Solution {
    static void swap(int[][] matrix,int i ,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }
        for (int[] row : matrix) {
        int left = 0;
        int right = row.length - 1;
        
            while (left < right) {
                // Swap elements using a temporary variable
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                
                left++;
                right--;
            }

        }
    }
}
