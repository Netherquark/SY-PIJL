/**
 * Mallard Duck with standard behaviors.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        swimBehavior = new SwimWithLegs();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck.");
    }
}

