package FactoryMethod;

public class Application
{
    private static Dialog dialog;

    public void initialize() throws Exception
    {
        String config = System.getProperty("os.name");

        if ("Windows".equalsIgnoreCase(config))
        {
            dialog = new WindowsDialog();
        }
        else if ("Web".equalsIgnoreCase(config))
        {
            dialog = new WebDialog();
        }
        else
        {
            throw new Exception("Error! Unknown operating system");
        }
    }

    public static void main(String[] args) throws Exception
    {
        Application app = new Application();

        app.initialize();
        dialog.render();
    }
}
