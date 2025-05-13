
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double diameter() {
        return 2 * radius;
    }

    public double perimeter() {
        return 2 * (Math.PI * radius);
    } 

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
