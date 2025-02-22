package Composite;

public class Main
{
    public static void main(String[] args)
    {
        CompoundGraphic components = new CompoundGraphic();
        ImageEditor imgEditor = new ImageEditor();

        imgEditor.load();

        imgEditor.groupSelected(components.getChildren());

        imgEditor.getAll().move(10, -10);

        imgEditor.groupSelected(components.getChildren());
    }
}
