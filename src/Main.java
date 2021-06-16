
import java.util.*;

class Student {

    private int id;
    private String name;
    private int intake;
    private String section;
    private String[] courses;
    private double CGPA;

    public Student(int id, String name, int intake, String section, String[] courses, double cGPA) {
        this.id = id;
        this.name = name;
        this.intake = intake;
        this.section = section;
        this.courses = courses;
        CGPA = cGPA;
    }

    public Student(int id, String name, int intake, String section) {
        this.id = id;
        this.name = name;
        this.intake = intake;
        this.section = section;
        CGPA = 0;
    }

    public void addCourses(String[] courses) {
        this.courses = courses;
    }
}

public class Main {

    public static void main(String[] args) {
        // creating student object and inputing value into it
        Student s1 = new Student(123, "Maynak", 20, "D");
        String[] s1Courses = {"ADBMS", "FEDT", "DSP", "Java"};
        s1.addCourses(s1Courses);

        // creating student object and inputing value into it
        Student s2 = new Student(124, "Vaibhav", 10, "A");
        String[] s2Courses = {"ADBMS", "FEDT", "DSP", "Java"};
        s2.addCourses(s2Courses);

        // creating student object and inputing value into it
        Student s3 = new Student(125, "Vivek", 10, "B");
        String[] s3Courses = {"ADBMS", "FEDT", "DSP", "Java"};
        s3.addCourses(s3Courses);

        // creating student object and inputing value into it
        Student s4 = new Student(126, "Kunal", 9, "B");
        String[] s4Courses = {"ADBMS", "FEDT", "DSP", "Java"};
        s4.addCourses(s4Courses);

        Student[] sArr = new Student[4];
        sArr[0] = s1;
        sArr[1] = s2;
        sArr[2] = s3;
        sArr[3] = s4;

        int i = 0;
        for (i = 0; i < 4; i++) {
            System.out.println("Student Details: " + sArr[i]);
        }

    }

}
