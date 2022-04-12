package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String s1, s2, s3, s4, s5;
        System.out.print("Введіть перше слово: ");
        if (src.hasNextLine()) {
            s1 = src.nextLine();
            System.out.print("Введіть друге слово: ");
            if (src.hasNextLine()) {
                s2 = src.nextLine();
                System.out.print("Введіть третє слово: ");
                if (src.hasNextLine()) {
                    s3 = src.nextLine();
                    System.out.print("Введіть четверте слово  : ");
                    if (src.hasNextLine()) {
                        s4 = src.nextLine();
                        System.out.print("Введіть п'яте слово : ");
                        if (src.hasNextLine()) {
                            s5 = src.nextLine();

                            System.out.print(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5);                }
                    }
                }
            }
        }
    }
}
