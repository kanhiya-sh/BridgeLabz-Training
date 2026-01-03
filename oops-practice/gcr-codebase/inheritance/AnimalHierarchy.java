package Capgemini_Day16_Inheritance;

class Animal {
    String name ;
    int age;

    Animal (String name, int age) {
        this.name = name;
        this .age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound !! ");
    }
}
class Dog extends Animal {
    Dog (String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Dog barks !! ");
    }
}
class Cat extends Animal {
    Cat (String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Cat meows !! ");
    }
}
class Bird extends Animal {
    Bird (String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Bird chirps !! ");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animal = { new Dog("Maverick", 3),
                            new Cat("Kitty", 2),
                            new Bird("Parrot", 1)};
        for (Animal a : animal) {
            System.out.println(a.name + " is " + a.age + " years old.");
            a.makeSound();
        }
    }
}
