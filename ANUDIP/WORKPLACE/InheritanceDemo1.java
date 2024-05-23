// Animal class
class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Cat class, subclass of Animal
class Dog extends Animal {
    // Override makeSound method to make the cat bark
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class to test
public class InheritanceDemo1 {
    public static void main(String[] args) {
        // Create an instance of Cat
        Dog d = new Dog();
        // Call makeSound method of Cat
        d.makeSound(); // This will print "Cat barks"

        // You can also create an instance of Animal and call makeSound
        Animal animal = new Animal();
        animal.makeSound(); // This will print "Animal makes a sound"
    }
}
