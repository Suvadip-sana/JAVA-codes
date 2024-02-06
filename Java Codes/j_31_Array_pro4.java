//To add 2d array of size 2x3
package com.company;

public class j_31_Array_pro4 {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9},
                         {2, 5, 3}};
        int[][] result = {{0, 0, 0},
                            {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { //row number of time
            for (int j = 0; j < mat1[i].length; j++) {  //column number of time
                System.out.printf("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("\nAfter addition the matrix is:");

        for (int i = 0; i < mat1.length; i++) { //row number of time
            for (int j = 0; j < mat1[i].length; j++) {  //column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); //print new line
        }
    }
}
