package lab8;

public abstract class Person {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}
