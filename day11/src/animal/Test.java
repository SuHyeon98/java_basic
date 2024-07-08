package animal;

public class Test {
    public static void main(String[] args) {

        /*
        Animal animal = new Animal("General", 5);
        animal.makeSound();
        animal.eat();
        */

        Dog dog = new Dog("Buddy", 3);
        dog.makeSound();
        dog.eat();
        dog.fetch();

        Cat cat = new Cat("Whiskers", 2);
        cat.makeSound();
        cat.eat();
        cat.scratch();
    }
}
