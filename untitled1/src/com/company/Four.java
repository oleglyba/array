package com.company;
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String s1, s2;
        System.out.print("Введіть перше слово: ");
        if (src.hasNextLine()) {
            s1 = src.nextLine();
            System.out.print("Введіть друге слово: ");
            if (src.hasNextLine()) {
                s2 = src.nextLine();
                if (s1.length() > s2.length()) {
                    System.out.println(s1 + "\n" + "Довжина рядка: " + s1.length());
                } else {
                    System.out.println(s2+ "\n" + "Довжина рядка: " + s2.length());
                }
            }
        }
    }
}

