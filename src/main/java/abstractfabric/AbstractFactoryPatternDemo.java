package abstractfabric;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        System.out.println("Shape is not rounded");
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        System.out.println("Shape is rounded");
        shapeFactory = FactoryProducer.getFactory(true);
        rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        square = shapeFactory.getShape("square");
        square.draw();

    }
}
