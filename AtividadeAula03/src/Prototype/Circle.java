package Prototype;

public class Circle extends Shape
{
    int radius;

    public Circle()
    {

    }

    public Circle(Circle source)
    {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone()
    {
        return new Circle(this);
    }
}
