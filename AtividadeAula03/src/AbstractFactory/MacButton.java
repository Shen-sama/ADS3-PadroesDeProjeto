package AbstractFactory;

public class MacButton implements Button
{
    @Override
    public void paint()
    {
        System.out.println("Renderizando um botão MacOS.");
    }
}
