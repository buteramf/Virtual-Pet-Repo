/**
Class for defining a dog in a virtual pet simulator.
*/
public class Dog extends Pet {
    /**
    Constructor for Dog. Uses the Super constructor from Pet to set
    the name of the Dog.
    @param name the name of the dog
    */
    public Dog(String name) {
        super(name);
    }

    /**
    Prints the name of the dog followed by "says: Woof!"
    */
    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }

    /**
    Prints the dog's name followed by "fetches a ball!"
    */
    public void fetch() {
        System.out.println(getName() + " fetches a ball!");
    }
}