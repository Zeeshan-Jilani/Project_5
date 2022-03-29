package com.company.Main;

public class TwoD_Array {
    public static void main(String[] args) {

        int sum = 0;
        int[][] matrix = new int [10][10];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (i == j){
                    matrix[i][j] = i;
                    sum += matrix[i][j];
                }
                else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Sum of diagonal = " + sum);
    }
}
