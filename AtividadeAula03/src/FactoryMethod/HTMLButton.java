package FactoryMethod;

public class HTMLButton implements Button
{

    @Override
    public void render()
    {
        System.out.println("Rederizando botão HTML.");
    }

    @Override
    public void onClick()
    {
        System.out.println("Botão HTML clickado.");
    }
}
