package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;

    public List<Integer> grades = new ArrayList<>();
    public float gradeAverage;

    public Student(String input){
       this.name = input;
    }

    public String getName() {
        return this.name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public void getGradeAverage(){
        float sum = 0;
        List<Integer> x = this.grades;
        for(int i = 0; i < x.size(); i++){
            sum += x.get(i);
        }
      this.gradeAverage = sum / x.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Yames");
        s1.addGrade(50);
        s1.addGrade(100);
        s1.addGrade(80);
        s1.addGrade(78);
        s1.addGrade(80);
        System.out.println("Student: " + s1.name);
        System.out.println("Grade Average: " + s1.gradeAverage);
    }
}
