// Base class (Superclass)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Single Inheritance: Dog is a subclass of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance: BabyDog is a subclass of Dog
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping");
    }
}

// Hierarchical Inheritance: Cat and Lion are subclasses of Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance Example
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.bark();
        System.out.println();

        // Multilevel Inheritance Example
        BabyDog myBabyDog = new BabyDog();
        myBabyDog.eat();
        myBabyDog.sleep();
        myBabyDog.bark();
        myBabyDog.weep();
        System.out.println();

        // Hierarchical Inheritance Example
        Cat myCat = new Cat();
        myCat.eat();
        myCat.sleep();
        myCat.meow();
        System.out.println();

        Lion myLion = new Lion();
        myLion.eat();
        myLion.sleep();
        myLion.roar();
    }
}
