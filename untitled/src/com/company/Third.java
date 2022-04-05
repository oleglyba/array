package com.company;

public class Third {
    public static void main(String[] args){
        int array[] = new int[15];
        int mid = 0;
        for (int i = 0; i < 15 ; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");}
        System.out.println();
        for (int i = 0; i <array.length ; i++)
        if (array[i] % 2 == 0)
             mid++;
        System.out.print(mid);}
    }
