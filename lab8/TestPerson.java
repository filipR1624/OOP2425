package lab8;

public class TestPerson {
    public static void main(String[] args) {
        // polymorphic array that will hold one student and one employee
        Person[] people = new Person[2];
        // creating the people objects
        Employee employee = new Employee("John", 3);
        Student student = new Student("Emilio", "Computer Science");

        // passing the people into the array
        people[0] = employee;
        people[1] = student;

        // using the methods
        System.out.println(people[0].getName());
        System.out.println(people[0].getDescription() + "\n");

        System.out.println(people[1].getName());
        System.out.println(people[1].getDescription());
    }
}
