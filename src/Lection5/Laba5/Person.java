package Lection5.Laba5;

public class Person {
     String fullName;
     int age;

    Person(){}
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    void  move(String fullName){
        System.out.println(fullName + " двигается");
    }
    void  talk(String fullName){
        System.out.println(fullName + " разговаривает");
    }
    void  print(){
        System.out.println("Имя " + this.fullName + " " + "возраст " + this.age);
    }
}
