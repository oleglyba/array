package com.company;

import java.util.Scanner;

public class Secomd {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double s1, s2, s3, max;
        System.out.print("Введіть перше число: ");
        if (src.hasNextDouble()) {
            s1 = src.nextDouble();
            System.out.print("Введіть друге число: ");
            if (src.hasNextDouble()) {
                s2 = src.nextDouble();
                System.out.print("Введіть третє число: ");
                if (src.hasNextDouble()) {
                    s3 = src.nextDouble();
                    if (s1 > s2 && s1 > s3) {
                        max = s1;
                    } else if (s2 > s1 && s2 > s3) {
                        max = s2;
                    } else {
                        max = s3;
                    }
                    System.out.println(max);
                } else {
                    System.out.println("Ввели не дробове число");
                }
            } else {
                System.out.println("Ввели не дробове число");
            }
        } else {
            System.out.println("Ввели не дробове число");
        }
    }
}
