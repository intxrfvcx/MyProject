package Lection6;
/* Лабораторная работа_Наследование
Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
Создайте переменную типа Student, которая ссылается на объект типа Aspirant.
Создайте метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5 баллам, то сумма 100 р, иначе 80 р. Переопределить этот метод в классе Aspirant.
Если средняя оценка аспиранта равна 5 баллам, то сумма 200 р, иначе 180 р.
Создайте массив типа Student, содержащий объекты класса Student и Aspirant. Вызовите метод getScholarship() для каждого элемента массива.
 */

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Миша","Петров","ИСТ",4);
        Aspirant aspirant1 = new Aspirant("Гриша","Иванов","РЛК",5);
        Student aspirant2 = new Aspirant("Олег","Воробьев","ИСТ", 4.5);
        Student[] students = {student1,aspirant1,aspirant2};

        for(Student student: students){
            System.out.println("Стипендия студента " + student.getLastName() + " составляет " + student.getScholarship());
        }
    }
}
