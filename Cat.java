/**
Class for defining a cat in a virtual pet simulator.
*/
public class Cat extends Pet {
	/**
	Constructor for Cat. Uses the Super constructor from Pet to set
	the name of the Cat
	@param name the name of the cat
	*/
    public Cat(String name) {
        super(name);
    }

	/**
	Prints the name of the cat followed by "says: Meow!"
	*/
    public void meow() {
        System.out.println(getName() + " says: Meow!");
    }

	/**
	Prints the name of the cat followed by a purring message
	*/
    public void purr() {
        System.out.println(getName() + " purrs happily!");
    }
}
