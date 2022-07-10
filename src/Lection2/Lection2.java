package Lection2;
/* Практическое задание 2.Переменные и примитивные типы данных Java
    Задание:
1) составить и нарисовать алгоритм работы программы, вычисляющий значение y по формуле y=(2x+5x)/4x.
2) в среде разработки инициализировать переменную и константу и присвоить им значения */

public class Lection2 {
    public static void main(String[] args) {

        final int VALUE = 5;

        float x = VALUE;
        float y = (2*x + 5*x) / 4*x;
        System.out.println(y);
    }
}
