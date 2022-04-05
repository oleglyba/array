package com.company;

public class First {
    public static void main(String[] args) {
        int[] Mas = new int[20];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 10);
            System.out.print(Mas[i] + " ");

        }System.out.println();

        for (int i = 0; i < Mas.length; i++) {
            if (Mas[i] % 2 != 0)
            Mas[i] = 0;
            System.out.print(Mas[i] + " ");

        }
    }
}


