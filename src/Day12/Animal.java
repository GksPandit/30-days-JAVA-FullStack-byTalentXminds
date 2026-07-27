package Day12;

public abstract class Animal {

    private int noOfLegs;

    public Animal() {
        System.out.println("Animal Creating...");
        noOfLegs = 4;
    }

    abstract void sound();

    void eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog is Barking...");
    }
}