package Prototype;

public abstract class Shape
{
    int x;
    int y;
    String color;

    public Shape()
    {

    }

    public Shape(Shape source)
    {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
