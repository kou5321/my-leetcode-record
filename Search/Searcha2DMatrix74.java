package Search;

public class Searcha2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 ) return false;
        int[] arr = new int[matrix.length * matrix[0].length];
        return find(arr, matrix, target);
    }

    boolean find(int[] arr, int[][] matrix, int target) {
        int start = 0, end = arr.length-1;
        int col = matrix[0].length;
        while(start <= end) {
            int mid = start + (end - start) / 2; // in it
            if (matrix[mid/col][mid%col] > target) {
                end = mid - 1;
            } else if (matrix[mid/col][mid%col] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
