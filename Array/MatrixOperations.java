package Array;

import java.util.Arrays;

public class MatrixOperations {

    // Method to get cofactor of matrix
    static void getCofactor(double[][] mat, double[][] temp, int p, int q, int n) {
        int i = 0, j = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    // Method to calculate determinant recursively
    static double determinant(double[][] mat, int n) {
        if (n == 1)
            return mat[0][0];

        double det = 0;
        double[][] temp = new double[n][n];
        int sign = 1;

        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, 0, f, n);
            det += sign * mat[0][f] * determinant(temp, n - 1);
            sign = -sign;
        }

        return det;
    }

    // Method to get adjoint matrix
    static void adjoint(double[][] mat, double[][] adj) {
        int N = mat.length;
        if (N == 1) {
            adj[0][0] = 1;
            return;
        }

        int sign;
        double[][] temp = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                getCofactor(mat, temp, i, j, N);
                sign = ((i + j) % 2 == 0) ? 1 : -1;
                adj[j][i] = sign * determinant(temp, N - 1);
            }
        }
    }

    // Method to find inverse of matrix
    static boolean inverse(double[][] mat, double[][] inverse) {
        int N = mat.length;
        double det = determinant(mat, N);
        if (det == 0) {
            System.out.println("Singular matrix, can't find its inverse");
            return false;
        }

        double[][] adj = new double[N][N];
        adjoint(mat, adj);

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                inverse[i][j] = adj[i][j] / det;

        return true;
    }

    // Method to find rank of a matrix
    static int rank(double[][] mat) {
        int m = mat.length, n = mat[0].length;
        double[][] temp = new double[m][n];
        for (int i = 0; i < m; i++)
            temp[i] = Arrays.copyOf(mat[i], n);

        int rank = n;
        for (int row = 0; row < rank; row++) {
            if (temp[row][row] != 0) {
                for (int col = 0; col < m; col++) {
                    if (col != row) {
                        double mult = temp[col][row] / temp[row][row];
                        for (int i = 0; i < rank; i++)
                            temp[col][i] -= mult * temp[row][i];
                    }
                }
            } else {
                boolean reduce = true;
                for (int i = row + 1; i < m; i++) {
                    if (temp[i][row] != 0) {
                        double[] tmp = temp[row];
                        temp[row] = temp[i];
                        temp[i] = tmp;
                        reduce = false;
                        break;
                    }
                }

                if (reduce) {
                    rank--;
                    for (int i = 0; i < m; i++)
                        temp[i][row] = temp[i][rank];
                }

                row--;
            }
        }
        return rank;
    }

    // Main method to test
    public static void main(String[] args) {
        double[][] matrix = {
                {2, 1, 3},
                {4, 1, 6},
                {7, 8, 9}
        };

        int n = matrix.length;

        System.out.println("Determinant: " + determinant(matrix, n));

        double[][] inverse = new double[n][n];
        if (inverse(matrix, inverse)) {
            System.out.println("Inverse Matrix:");
            for (double[] row : inverse)
                System.out.println(Arrays.toString(row));
        }

        System.out.println("Rank: " + rank(matrix));
    }
}
