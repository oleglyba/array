package com.company;

public class Six {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        int array1[] = new int[7];
        int mid = 0;
        int m = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (Math.random() * 6);
                mid = mid + array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }System.out.println();
        for (int i = 1; i < 7; i++) {
            if (array1[i] > array1[m]) {
                m = i;
        System.out.print(array[m][i] + " ");
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(array[m][i] + " ");
        }
    }
}
