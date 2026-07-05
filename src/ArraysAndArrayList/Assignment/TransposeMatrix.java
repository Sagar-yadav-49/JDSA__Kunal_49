package ArraysAndArrayList.Assignment;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
//        int[][] matrix={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int[][] matrix={
                {1,2,3},
                {4,5,6}
        };

        for (int[] ele:transpose(matrix)){
            System.out.println(Arrays.toString(ele));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int rowSize=0;
        int colSize=0;
        for (int i = 0; i < matrix.length; i++) {
            colSize=0;
            rowSize++;
            for (int j = 0; j < matrix[i].length; j++) {
                colSize++;
            }
        }
        int[][] transpose=new int[colSize][rowSize];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                if(i==j) {
                    transpose[i][j]=matrix[i][j];
                } else {
                        transpose[i][j]=matrix[j][i];
                }
            }
        }
        return transpose;
    }
}