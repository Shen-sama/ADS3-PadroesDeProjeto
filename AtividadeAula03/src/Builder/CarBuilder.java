package Builder;

public class CarBuilder implements Builder
{
    private Car car;

    public CarBuilder()
    {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int qtdSeats)
    {
        System.out.println("Setando os " + qtdSeats + " assentos do carro.");
    }

    @Override
    public void setEngine() {
        System.out.println("Setando o motor do carro.");
    }

    @Override
    public void setTripComputer(boolean exist) {
        if (exist)
            System.out.println("Setando o computador de bordo do carro.");
        else
            System.out.println("Este carro não tem computador de bordo.");
    }

    @Override
    public void setGPS(boolean exist) {
        if (exist)
            System.out.println("Setando o GPS do carro.");
        else
            System.out.println("Este carro não tem GPS.");
    }

    public Car getProduct()
    {
        Car product = this.car;
        this.reset();
        return product;
    }
}
