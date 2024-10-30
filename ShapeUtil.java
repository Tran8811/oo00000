import java.util.List;

public class ShapeUtil {
    /**
     * hahwhshs.
     * @param shapes hinh hoc
     * @return shape
     */
    public String printInfo(List<GeometricObject> shapes) {
        String shape1 = "Circle:\n";
        String shape2 = "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                shape1 += shape.getInfo() + "\n";
            } else if (shape instanceof Triangle) {
                shape2 += shape.getInfo() + "\n";
            }
        }
        shape1 = shape1.trim();
        shape2 = shape2.trim();
        String res = shape1 + "\n" + shape2;
        return res;
    }
}
