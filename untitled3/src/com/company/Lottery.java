package com.company;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        int j = 2;
        int m = 0;
        int i = 0;
        int player, player2, player3;
            int[] array = new int[3];
            for (; i < array.length; i++) {
                array[i] = (int) (Math.random() * 3) + 1;
                System.out.println(array[i]); //вивів масив, щоб було легше перевірити
            }
            while (m != 2) {
            m++;
            Scanner src = new Scanner(System.in);
            System.out.println("Комп'ютер загадав три числа з проміжку [0;3], спробуй вгадати послідовність за " + j + " спроби");
            System.out.print("Введіть перше число: ");
            if (src.hasNextInt()) {
                player = src.nextInt();
                System.out.print("Введіть друге число: ");
                if (src.hasNextInt()) {
                    player2 = src.nextInt();
                    System.out.print("Введіть третє число: ");
                    if (src.hasNextInt()) {
                        player3 = src.nextInt();
                        if (player == array[0] && player2 == array[1] && player3 == array[2]) {
                                System.out.println("Вгадали послідовність, наші вітання!");
                                break;
                        } else {
                                System.out.println("Не вгадали : " + (2 - m) +" спроб");
                            }

                        }
                    }
                } j--;
            }
        }
    }