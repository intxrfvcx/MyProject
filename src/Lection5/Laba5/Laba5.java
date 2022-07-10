package Lection5.Laba5;

/*  Лабораторная работа 5_Классы_Объекты

1.Создать класс Person, который содержит:
- переменные fullName, age;
- методы move() и talk(), в которых вывести на консоль сообщение "Такой-то  Person говорит".
2. Добавить два конструктора: Person() и Person(fullName, age).
3. Создать два объекта этого класса:  Person() и Person(fullName, age). */

import java.util.Scanner;
//

public class Laba5 {
    public static void main(String[] args) {
        //Сканнер
        Scanner scanner = new Scanner(System.in);
        //man
        System.out.println("Введите имя для man");
        String name = scanner.nextLine();
        System.out.println("Введите возраст для man");
        int age = scanner.nextInt();
        Person man = new Person(name,age);
        man.print();
        man.talk(name);

        //woman
        name = scanner.nextLine();
        System.out.println("Введите имя для woman");
        name = scanner.nextLine();
        System.out.println("Введите возраст для woman");
        age = scanner.nextInt();
        Person woman = new Person(name,age);
        woman.print();
        woman.move(name);
    }
}
