package shapes;

public class Circle extends Shape {
    // instance variables
    private double radius;
    //constructors
    public Circle() {
        super(0);
        radius = 1;
    }
    public Circle(double radius) {
        super(0);
        setRadius(radius);
    }
    // methods
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("The radius must be greater than 0");
        }
        this.radius = radius;
    }
    
    @Override
    public String getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        String areaStr = String.format("%.2f", area);
        return areaStr;
    }
}
