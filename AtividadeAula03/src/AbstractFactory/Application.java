package AbstractFactory;

public class Application
{
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory)
    {
        this.factory = factory;
    }

    public void createUI()
    {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void paint()
    {
        button.paint();
        checkbox.paint();
    }
}
