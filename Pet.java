/**
Class for defining a generic pet in a virtual pet simulator.
*/
public class Pet {
    private final String name;
    private int hunger;
    private int happiness;

	/**
	Constructor for a Pet. Sets the defined name and
	sets default hunger and happiness values of 50
	@param name the name of the pet
	*/
    public Pet(String name) {
        this.name = name;
        hunger = 50;
        happiness = 50;
    }

	/**
	Getter for the name of the pet
	@return the name of the pet
	*/
    public String getName() {
        return name;
    }

	/**
	Feeds the pet by a default value of 20
	*/
    public void feed() {
        hunger = Math.max(0, hunger - 20);
    }

	/**
	Play with the pet to increase its happiness. Increases
	happiness by a default value of 15. Increases hunger by
	a default value of 10
	*/
    public void play() {
        happiness = Math.min(100, happiness + 15);
        hunger = Math.min(100, hunger + 10);
    }

	/**
	Prints out the status of the pet's hunger and happiness
	*/
    public void showStatus() {
        System.out.println(name + " | Hunger: " + hunger
                + " | Happiness: " + happiness);
    }

	/**
	Puts the pet to sleep. Increases happiness by 25
	and slightly increases hunger
	*/
    public void sleep() {
        happiness = Math.min(100, happiness + 25);
        hunger = Math.min(100, hunger + 5);
        System.out.println(name + " takes a nap.");
    }
}
