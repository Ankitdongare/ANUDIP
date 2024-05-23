class Animal1 {
    public void move() {
        System.out.println("The animal move");
    }

    public void makeSound() {
        System.out.println(" animal makes a sound");
    }
}

class Bird extends Animal1 {
    @Override
    public void move() {
        System.out.println("The bird move");
    }

    @Override
    public void makeSound() {
        System.out.println("The bird make sound");
    }
}

class Panther extends Animal1 {
    @Override
    public void move() {
        System.out.println("The Panther moves");
    }

    @Override
    public void makeSound() {
        System.out.println("The panther make sound");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();
        bird.makeSound();

        Panther panther = new Panther();
        panther.move();
        panther.makeSound();

        }
    }

