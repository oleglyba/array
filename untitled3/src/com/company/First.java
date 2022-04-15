package com.company;

public class First {
    public static void main(String[] args) {
        int a ,b;
        double c, S, P;
        a = 3;
        b = 4;
        c = Math.sqrt(a* a + b * b);
        S = (int) (0.5 * a * b);
        P = a + b + c;
        System.out.println( "Площа трикутника: " + S);
        System.out.println( "Периметр трикутника: " + P);
    }
}