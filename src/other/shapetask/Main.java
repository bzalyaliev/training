package other.shapetask;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(0, 0), 0.5, Color.GREEN);
        System.out.println(circle.getArea());

        Shape shape = circle;
        System.out.println(shape.getArea());

        Object object = circle;

        circle = (Circle) object;
        System.out.println(circle.getArea());

    }
}
