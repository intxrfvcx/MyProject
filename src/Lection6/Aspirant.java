package Lection6;

public class Aspirant extends Student{
    private double averageMark;
    Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    @Override
    double getScholarship(){
        return averageMark == 5 ? 200 : 180;
    }
}
