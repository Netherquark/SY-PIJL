/**
 * Redhead Duck with standard behaviors.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        swimBehavior = new SwimWithLegs();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck.");
    }
}

