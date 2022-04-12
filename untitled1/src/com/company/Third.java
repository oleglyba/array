package com.company;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String s1, s2;
        System.out.print("Введіть перше слово: ");
        if (src.hasNextLine()) {
            s1 = src.nextLine();
            System.out.print("Введіть друге слово: ");
            if (src.hasNextLine()) {
                s2 = src.nextLine();
                if (s1.equals(s2)) {
                    System.out.println("Слова ідентичні");
                } else {
                    System.out.println("Слова різні");

                }
            }
        }

    }
}
