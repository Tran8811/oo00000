import java.awt.*;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * hahahha.
     * @param p1 p
     * @param p2 d
     * @param p3 f
     * @throws RuntimeException loi
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) == 0 || p2.distance(p3) == 0
                || p3.distance(p1) == 0 || isStraight(p1, p2, p3)) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * hahah.
     * @param p1 f
     * @param p2 f
     * @param p3 f
     * @return f
     */
    private boolean isStraight(Point p1, Point p2, Point p3) {
        return new Triangle(p1, p2, p3).getArea() == 0;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * hahaha.
     * @return f
     */
    @Override
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                        + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                        + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2.0;
    }

    /**
     * hahh.
     * @return f
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p3.distance(p1) + p3.distance(p2);
    }

    /**
     * hahah.
     * @return fff
     */
    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]", p1.getPointX(),
                p1.getPointY(), p2.getPointX(), p2.getPointY(), p3.getPointX(), p3.getPointY());
    }
}
