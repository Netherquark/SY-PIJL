/**
 * Abstract Duck class using Strategy Pattern for behaviors.
 */
public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;
    protected FlyBehavior flyBehavior;

    // Setters for dynamic behavior change
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    // Delegate behaviors
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    // Display duck type
    public abstract void display();
}

