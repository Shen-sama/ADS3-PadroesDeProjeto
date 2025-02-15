package Builder;

public class Application
{
    public static void makeSportsCar()
    {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();
    }

    public static void makeSUV()
    {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSUV(carBuilder);
        Car car = carBuilder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSUV(manualBuilder);
        Manual manual = manualBuilder.getProduct();
    }

    public static void main(String[] args)
    {
        makeSportsCar();
        makeSUV();
    }
}
