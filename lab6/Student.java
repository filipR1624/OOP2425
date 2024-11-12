// Author : Filip Raguz
// Date : 12th November
// Purpose : My implementation of Student (lab5)

package lab6;

public class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[3];
        grades = new int[3];
    }

    public String toString() {
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        double grade = 0;
        for (int i = 0; i <= numCourses; i++) {
            grade += (double)grades[i];
        }
        return grade / numCourses;
    }
}
