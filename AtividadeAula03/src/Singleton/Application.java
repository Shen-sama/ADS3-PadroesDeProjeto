package Singleton;

public class Application
{
    public static void main(String[] args)
    {
        Database foo = Database.getInstance();
        foo.querry("SELECT * FROM users");

        Database bar = Database.getInstance();
        bar.querry("SELECT * FROM products");

        System.out.println(foo == bar);
    }
}
