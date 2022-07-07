package Lection3;
/* Лабораторная работа 2_Арифметика_Конструкции (if, if/else, switch)

    Задание: написать программу в которой пользователь угадывает число при помощи циклов и условий.
Угадывание числа осуществляется путем сравнения числа введенного пользователем с числом заранее установленным в программе.
Результат сравнения должен быть отображен пользователю. */

import java.util.Scanner;
public class Laba2 {
    public static void main(String[] args) {

        System.out.println("Что выйграть, вам необходимо угадать число в диапазоне от 1 до 20");
        int min = 1;
        int max = 20;
        int UserNumber;
        int UnknownNumber = min + (int)(Math.random() * ((max - min) + 1));
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Введите ваше число: ");
            UserNumber = input.nextInt();
            if (UserNumber > UnknownNumber)
                System.out.println("Моё число меньше.");
            else if (UserNumber < UnknownNumber) System.out.println("Моё число больше.");
            else System.out.println("Вы угадали!");
        } while (UserNumber != UnknownNumber);
    }
}
