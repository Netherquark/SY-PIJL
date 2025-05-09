/**
 * Cylinder shape class.
 */
public class Cylinder extends Shape implements Volume {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height); // Surface area
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Perimeter of base
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

