package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GradesApplication{
private static Scanner sc = new Scanner(System.in);
private static Scanner sb = new Scanner(System.in);
private static Student selectedStudent;
    public static void main(String[] args) {
        HashMap<String, Object> students = new HashMap<>();

        Student s1 = new Student("Jim");
        s1.addGrade(88);
        s1.addGrade(94);
        s1.addGrade(74);
        s1.getGradeAverage();
        Student s2 = new Student("Tim");
        s2.addGrade(88);
        s2.addGrade(55);
        s2.addGrade(74);
        s2.getGradeAverage();
        Student s3 = new Student("Bim");
        s3.addGrade(33);
        s3.addGrade(94);
        s3.addGrade(57);
        s3.getGradeAverage();
        Student s4 = new Student("Lim");
        s4.addGrade(88);
        s4.addGrade(11);
        s4.addGrade(74);
        s4.getGradeAverage();

        students.put("Howdydoody", s1);
        students.put("ToolManTim", s2);
        students.put("BabaBooy", s3);
        students.put("Lim81", s4);

        System.out.println("Enter GitHub profile to view Student's grade : \n" + students.keySet());
        String input;
        String response;
        do { //do-while response
            do {
                System.out.print("Enter GH name: ");
                input = sc.nextLine();
                if (students.containsKey(input)) {
                    selectedStudent = (Student) students.get(input);
                    System.out.println("Student: " + selectedStudent.getName());
                    System.out.println("Grade Average: " +  selectedStudent.gradeAverage);
                } else {
                    System.out.println("No entries found, please check spelling");
                }
            } while (!students.containsKey(input));
            System.out.println(students.keySet());
            System.out.println("Enter another profile?");
            response = sb.nextLine();
        }while(response.matches("(?i)y|yes|true")) ;

    }
}
