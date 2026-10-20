/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
		// Define starting pets
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");
        Bird bird = new Bird("Kiwi");

		// Print information about the pets
        System.out.println("Your pets are waiting for you!");
        dog.bark();
        cat.meow();
        bird.chirp();

        dog.feed();
        cat.play();
        dog.sleep();

        dog.showStatus();
        cat.showStatus();
        bird.showStatus();
    }
}
