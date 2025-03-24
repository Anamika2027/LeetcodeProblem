import java.util.Scanner;
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Arrays to mark rows and columns that need to be set to zero
        boolean[] rowZero = new boolean[m];
        boolean[] colZero = new boolean[n];

        // Step 1: Identify which rows and columns should be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Step 2: Set the marked rows to zero
        for (int i = 0; i < m; i++) {
            if (rowZero[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set the marked columns to zero
        for (int j = 0; j < n; j++) {
            if (colZero[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Reading the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Creating an object of Solution class
        Solution solution = new Solution();
        solution.setZeroes(matrix);

        // Output the modified matrix
        System.out.println("\nModified Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}