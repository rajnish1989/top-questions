package CTCI.ArraysAndString;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(input);
        for(int i = 0; i<input.length; i++){
            for(int j = 0; j<input.length; j++){
                System.out.print(input[i][j] +" ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
