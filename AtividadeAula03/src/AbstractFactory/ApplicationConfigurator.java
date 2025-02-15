package AbstractFactory;

public class ApplicationConfigurator
{
    public static void main(String[] args) throws Exception
    {
        GUIFactory factory;
        String config = System.getProperty("os.name");

        if ("Windows".equalsIgnoreCase(config))
        {
            factory = new WinFactory();
        }
        else if ("Mac".equalsIgnoreCase(config))
        {
            factory = new MacFactory();
        }
        else
        {
            throw new Exception("Error! Unknown operating system");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
