// Author : Filip Raguz
// Date : 12th November
// Purpose : My implementation of Teacher (lab5)

package lab6;

public class Teacher extends Person{
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[3];
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        if (numCourses < 3) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                courses[i] = "";
                return true;
            }
        }
        return false;
    }
}
