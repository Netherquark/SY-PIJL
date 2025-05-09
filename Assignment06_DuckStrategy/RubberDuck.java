/**
 * Rubber Duck with squeak and floating behaviors.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        swimBehavior = new Floating();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}

