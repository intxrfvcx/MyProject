package Lection6;

public class Student {

    private String firstName, lastName, group;
    double averageMark;
    Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getGroup(){
        return group;
    }
    double getScholarship(){
        return averageMark == 5 ? 100 : 80;
    }
}
