public class ShapeFactory {
    public Shape getShape(String typeOfShape) {
        if (typeOfShape.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        else if (typeOfShape.equalsIgnoreCase("square")) {
            return new Square();
        }
        else if (typeOfShape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        else
            return null;
    }
}
