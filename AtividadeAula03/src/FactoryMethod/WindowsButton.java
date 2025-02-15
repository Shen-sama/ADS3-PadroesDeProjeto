package FactoryMethod;

public class WindowsButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("Renderizando um botão Windows.");
    }

    @Override
    public void onClick()
    {
        System.out.println("Botão Windows clickado.");
    }
}
