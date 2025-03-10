package Composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic
{
    private ArrayList<Graphic> children = new ArrayList<>();

    public void add(Graphic child)
    {
        children.add(child);
    }

    public void remove(Graphic child)
    {
        children.remove(child);
    }

    public ArrayList<Graphic> getChildren()
    {
        return children;
    }

    @Override
    public void move(int x, int y)
    {
        for (Graphic child : children)
        {
            child.move(x, y);
        }
    }

    @Override
    public void draw()
    {
        for (Graphic child : children)
        {
            child.draw();
        }
    }
}
