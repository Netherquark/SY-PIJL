/**
 * Equilateral Pyramid (Square Base) shape class.
 */
public class EquilateralPyramid extends Shape implements Volume {
    private final double baseLength;
    private final double height;

    public EquilateralPyramid(double baseLength, double height) {
        super("Equilateral Pyramid (Square Base)");
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt((baseLength / 2) * (baseLength / 2) + height * height);
        return baseLength * baseLength + 2 * baseLength * slantHeight;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * baseLength;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseLength * baseLength * height;
    }
}

