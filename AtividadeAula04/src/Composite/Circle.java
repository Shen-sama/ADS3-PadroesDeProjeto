package Composite;

public class Circle extends Dot
{
    private double radius;
    public Circle(int x, int y, double radius)
    {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("Coordenada X do círculo: " + x);
        System.out.println("Coordenada Y do círculo " + y);
        System.out.println("Raio do círculo: " + radius + "\n");
    }
}
