public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * hahaha.
     * @param center c
     * @param radius r
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * hahaha.
     * @return p
     */
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * haha.
     * @return p
     */
    @Override
    public double getPerimeter() {
        return 2.0 * PI * radius;
    }

    /**
     * hahah.
     * @return r
     */
    @Override
    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]",
                center.getPointX(), center.getPointY(), radius);
    }
}
