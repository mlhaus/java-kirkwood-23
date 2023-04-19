package ch1and2.shapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape2 = new Rectangle();
        Circle circle = null;
        try {
            circle = new Circle(-2.5);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            circle = new Circle();
        }

        Rectangle rect = new Rectangle(2.25, 4.1);

        System.out.println(circle.getArea());
        System.out.println(rect.getArea());

        Cylinder cylinder1 = new Cylinder(); // height 1, radius 1
        Cylinder cylinder2 = new Cylinder(4.5, circle); // height 4.5, radius 2.5
        System.out.printf("%.2f\n",cylinder1.getArea());
        System.out.printf("%.2f\n",cylinder2.getArea());
        System.out.printf("%.2f\n",cylinder1.getVolume());
        System.out.printf("%.2f\n",cylinder2.getVolume());
    }
}
