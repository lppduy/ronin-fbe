package b09.b2;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {  // Inheritance: Dog "is a" Animal

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.bark();  // Output: Buddy is barking
    }
}

