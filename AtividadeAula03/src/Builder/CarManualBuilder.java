package Builder;

public class CarManualBuilder implements Builder
{
    private Manual manual;

    public CarManualBuilder()
    {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int qtdSeats) {
        System.out.println("O manual do carro tem informação sobre " + qtdSeats + " assentos.");
    }

    @Override
    public void setEngine() {
        System.out.println("O manual do carro tem uma parte sobre o motor");
    }

    @Override
    public void setTripComputer(boolean exist) {
        if (exist)
            System.out.println("O manual tem informação sobre o computador de bordo.");
        else
            System.out.println("O manual não tem informação sobre o computador de bordo.");
    }

    @Override
    public void setGPS(boolean exist) {
        if (exist)
            System.out.println("O manual tem informação sobre o GPS.");
        else
            System.out.println("O manual não tem informação sobre o GPS.");
    }

    public Manual getProduct()
    {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
