import java.util.List;

public class ShapeUtil {
    /**
     * hahwhshs.
     * @param shapes hinh hoc
     * @return shape
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder circles = new StringBuilder("Circle:\n");
        StringBuilder triangles = new StringBuilder("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circles.append(circle.getInfo()).append("\n");
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                triangles.append(triangle.getInfo()).append("\n");
            }
        }
        return circles.append(triangles).toString();
    }
}
