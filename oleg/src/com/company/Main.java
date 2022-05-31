package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number : ");
            n = scan.nextInt();
            int factorial = 1;
            for (int i = 2; i <= n; i++)
                factorial *= i;
            System.out.println(factorial);
            if (n == 0 || n == 1){
                System.out.println(factorial);}
            if(n < 0){
                System.out.println("the factorial cannot be negative");}
        } while (n < 0);
        {System.out.println("end");}

        One test = new One(10000, 4);
        test.entrance();

    }
}
