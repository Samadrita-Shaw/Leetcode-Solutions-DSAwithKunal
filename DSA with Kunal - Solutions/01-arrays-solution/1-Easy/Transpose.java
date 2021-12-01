package com.company;
 class Transpose {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] arr = new int[col][row];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                arr[c][r] = matrix[r][c];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
        };

        arr=transpose(arr);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
