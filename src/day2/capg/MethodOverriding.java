package day2.capg;
//[1]
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // prints "The animal makes a sound"
        
        Dog dog = new Dog();
        dog.sound(); // prints "The dog barks"
        
        Animal animal2 = new Dog();
        animal2.sound(); // prints "The dog barks"
    }
}

