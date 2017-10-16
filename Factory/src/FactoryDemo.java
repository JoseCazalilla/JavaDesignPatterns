public class FactoryDemo {
    public static void main (String[] args) {

        // We create the Factory
        ShapeFactory fact = new ShapeFactory();

        //Let's create a circle
        Shape circle = fact.getShape("Circle");
        circle.draw();

        //Let's create a rectangle
        Shape rectangle = fact.getShape("Rectangle");
        rectangle.draw();
    }
}
