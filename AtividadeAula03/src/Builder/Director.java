package Builder;

public class Director
{
    public void constructSportsCar(Builder builder)
    {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine();
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder)
    {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine();
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}
