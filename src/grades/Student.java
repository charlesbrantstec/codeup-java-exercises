package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sumOfGrades = 0;
        for(int i = 0; i < grades.size(); i++)
            sumOfGrades += grades.get(i);
        return sumOfGrades / grades.size();
    }

    public static void main (String[] args){
        Student Charles = new Student("Charles");
        System.out.println(Charles.getName());
        Charles.addGrade(93);
        Charles.addGrade(96);
        Charles.addGrade(99);
        System.out.println(Charles.grades);
        System.out.println(Charles.getGradeAverage());
    }

}
