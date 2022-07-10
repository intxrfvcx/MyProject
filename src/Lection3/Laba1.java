package Lection3;
import java.util.Scanner;
/*
Лабораторная работа_1_Арифметика_Конструкции (if, if/else, switch)

    Введите первое число: 10 <enter>
    Введите второе число: 15 <enter>
    Введите третье число: 20 <enter>
            Сумма чисел = 45        */

public class Laba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int sum = first + second + third;
        String output = String.format("Сумма равна: %s", sum);
        System.out.println(output);

    }
}
