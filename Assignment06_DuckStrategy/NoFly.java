/**
 * Fly behavior for ducks that cannot fly.
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}

