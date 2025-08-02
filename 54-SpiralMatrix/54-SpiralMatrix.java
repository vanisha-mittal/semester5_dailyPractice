// Last updated: 8/2/2025, 4:04:40 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minc = 0;
        int maxc = matrix[0].length - 1;
        int minr = 0;
        int maxr = matrix.length - 1;
        List<Integer> result = new ArrayList<>();
        int totalElements = matrix.length * matrix[0].length;
        int count = 0;
        
        while (count < totalElements) {
            // Traverse from left to right
            for (int i = minc; i <= maxc && count < totalElements; i++) {
                result.add(matrix[minr][i]);
                count++;
            }
            minr++;
            
            // Traverse downwards
            for (int j = minr; j <= maxr && count < totalElements; j++) {
                result.add(matrix[j][maxc]);
                count++;
            }
            maxc--;
            
            // Traverse from right to left
            for (int i = maxc; i >= minc && count < totalElements; i--) {
                result.add(matrix[maxr][i]);
                count++;
            }
            maxr--;
            
            // Traverse upwards
            for (int j = maxr; j >= minr && count < totalElements; j--) {
                result.add(matrix[j][minc]);
                count++;
            }
            minc++;
        }
        
        return result;
    }
}