package Composite;

public class Dot implements Graphic
{
    int x, y;

    public Dot(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw()
    {
        System.out.println("Coordenada X do ponto: " + x);
        System.out.println("Coordenada Y do ponto " + y + "\n");
    }
}
