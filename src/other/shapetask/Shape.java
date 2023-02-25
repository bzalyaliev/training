package other.shapetask;

import static java.lang.Double.NaN;

public class Shape {

    private final Color color;

    public Shape (Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return NaN;
    }

}
