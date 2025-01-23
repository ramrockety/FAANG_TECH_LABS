/*
 Rotate matrix by 90 degrees
Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
The rotation must be done in place, meaning the input 2D matrix must be modified directly.
Examples:
Input: matrix = [[1, 2, 31, [4, 5, 61, [7, 8, 9]]
Output: matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

Input: matrix = [[0, 1, 1, 2), [2, O, 3, 1], [4, 5, O, 5), [5, 6, 7, O]]
Output: matrix = [[5, 4, 2, O1, [6, 5, O, 11, (7, 0, 3, 11, [O, 5, 1, 2]]
 */

package Arrays;
import java.util.Arrays;

public class RotateMatrixBy90{

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        /*
         * another reverse approach
         * for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
         */
        
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Before rotation");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        rotate(matrix);
        System.out.println("after rotation");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

