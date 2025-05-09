/**
 * Drowning Duck with drown swim behavior.
 */
public class DrowningDuck extends Duck {
    public DrowningDuck() {
        quackBehavior = new Quack();
        swimBehavior = new Drown();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Drowning Duck.");
    }
}

