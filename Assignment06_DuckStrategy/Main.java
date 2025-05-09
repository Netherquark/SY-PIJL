/*
 * Name: Your Name
 * PRN: Your PRN
 * Batch: Your Batch
 */

public class Main {
    public static void main(String[] args) {
        // Demonstrate MallardDuck
        System.out.println("----- Mallard Duck -----");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performSwim();
        mallardDuck.performFly();

        // Demonstrate RubberDuck
        System.out.println("\n----- Rubber Duck -----");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        rubberDuck.performFly();

        // Demonstrate RedheadDuck
        System.out.println("\n----- Redhead Duck -----");
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performSwim();
        redheadDuck.performFly();

        // Demonstrate DrowningDuck
        System.out.println("\n----- Drowning Duck -----");
        Duck drowningDuck = new DrowningDuck();
        drowningDuck.display();
        drowningDuck.performQuack();
        drowningDuck.performSwim();
        drowningDuck.performFly();
    }
}

