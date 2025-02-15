package AbstractFactory;

public class WinButton implements Button
{
    @Override
    public void paint()
    {
        System.out.println("Renderizando um botão do Windows");
    }
}
