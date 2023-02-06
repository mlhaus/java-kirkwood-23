package shapes;

public class Rectangle extends Shape {
    // instance variables
    private double length;
    private double height;
    //constructors
    public Rectangle() {
        super(4);
    }

    @Override
    public String getArea() {
        double area = length * height;
        String areaStr = String.format("%.2f", area);
        return areaStr;
    }

    public Rectangle(double length, double height) {
        super(4);
        setLength(length);
        setHeight(height);
    }
    // methods

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0) {
            throw new IllegalArgumentException("The length must be greater than 0");
        }
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("The height must be greater than 0");
        }
        this.height = height;
    }
}
