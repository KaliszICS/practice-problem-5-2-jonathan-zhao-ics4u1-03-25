public class Sphere extends Circle {
 
    private double radius;
    public Sphere(double radius) {
        super(radius);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); //change to 4.0 & 3.0 since the we're returning doubles
    }
}
