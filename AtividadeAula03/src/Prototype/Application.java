package Prototype;

import java.util.ArrayList;

public class Application
{
    ArrayList<Shape> shapes = new ArrayList<>();

    public Application()
    {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);
    }

    public void businessLogic()
    {
        ArrayList<Shape> shapesCopy = new ArrayList<>();

        for (Shape s : shapes)
        {
            shapesCopy.add(s.clone());
        }
    }

    public static void main(String[] args)
    {
        Application app = new Application();

        for (Shape c : app.shapes)
        {
            System.out.println("X: " + c.x);
            System.out.println("Y: " + c.y);
        }
    }
}
