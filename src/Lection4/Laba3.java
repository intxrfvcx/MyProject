package Lection4;
/* Лабораторная работа 3_Массивы_Циклы.

    Задание: дан массив с элементами [2, 3, 4, 5, 6, 7, 8, 9, 10].
    С помощью условных конструкций и цикла for найдите произведение элементов данного массива.
 */

public class Laba3 {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int retult = 1;

        for(int i=0; i < array.length; i++){
            retult *= array[i];
            System.out.println(retult);
        }
    }
}
