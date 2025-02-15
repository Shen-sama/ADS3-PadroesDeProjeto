package Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Database
{
    private static Database instance;
    private static final ReentrantLock lock = new ReentrantLock();

    private Database()
    {

    }

    public static Database getInstance()
    {
        if (Database.instance == null)
        {
            lock.lock();
            if (Database.instance == null)
            {
                Database.instance = new Database();
            }

            lock.unlock();
        }

        return Database.instance;
    }

    public void querry (String sql)
    {
        System.out.println("Executando consulta: " + sql);
    }
}
