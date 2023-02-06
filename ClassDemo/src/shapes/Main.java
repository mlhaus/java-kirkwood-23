package shapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape2 = new Rectangle();

        Circle circle = new Circle(2.5);
        Rectangle rect = new Rectangle(2.25, 4.1);

        System.out.println(circle.getArea());
        System.out.println(rect.getArea());
    }
}
