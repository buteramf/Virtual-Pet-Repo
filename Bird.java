/**
Class for defining a bird in a virtual pet simulator.
*/
public class Bird extends Pet {
	/**
	Constructor for Bird. Uses the Super constructor from Pet to set
	the name of the Bird
	@param name the name of the bird
	*/
    public Bird(String name) {
        super(name);
    }

	/**
	Prints the name of the bird followed by "says: Tweet!"
	*/
    public void chirp() {
        System.out.println(getName() + " says: Tweet!");
    }
}
