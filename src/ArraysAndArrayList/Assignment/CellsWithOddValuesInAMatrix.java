package ArraysAndArrayList.Assignment;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int[][] indices={
                {0,1},
                {1,1}
        };
        int m=2;
        int n=3;
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        int count=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(indices[i][j]==0){
                matrix[0][j]+=1;
                } else if (indices[i][j]==1) {
                    matrix[1][j]+=1;
                }

            }
        }
        return count;
    }
}
