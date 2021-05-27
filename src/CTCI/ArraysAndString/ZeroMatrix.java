package CTCI.ArraysAndString;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
    public static void main(String[] args) {
        //int[][] matrix = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        int[][] matrix = {{0,1}};
        setZeroes(matrix);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {
        boolean fr = false, fc = false;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i<matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr){
            for(int i = 0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        if(fc){
            for(int i = 0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
