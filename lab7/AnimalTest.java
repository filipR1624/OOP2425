// Author : Filip Raguz
// Date : 12th November
// Purpose : Tests other classes and their methods (from lab7)


package lab7;

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

        Vet vet = new Vet("John");
        vet.vaccinate(dog);
        vet.vaccinate(cat);
		}
}