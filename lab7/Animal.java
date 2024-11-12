// Author : Filip Raguz
// Date : 12th November
// Purpose : Implementation of Animal from Slides

package lab7;

public class Animal {
    private String type;
    private int age;
    private char gender;

    public Animal(String type, int age, char gender) {
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return type + ", " + age + ", " + gender;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void makeSound() {
        System.out.println("A generic animal sound");
    }
}
