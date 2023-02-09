package shapes;

public abstract class Shape {
    // instance variables
    private int numSides;
    // constructors
    public Shape() {
        numSides = 0;
    }

    public Shape(int numSides) {
        setNumSides(numSides);
    }
    // methods
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        if(numSides < 0) {
            throw new IllegalArgumentException("Number of sides must be 0 or greater");
        }
        this.numSides = numSides;
    }
    
    public abstract double getArea();
    
}
