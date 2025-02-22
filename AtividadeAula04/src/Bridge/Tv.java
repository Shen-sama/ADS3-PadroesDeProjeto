package Bridge;

public class Tv implements Device
{
    private boolean enabled;
    private int volume, channel;
    @Override
    public boolean isEnabled()
    {
        return enabled;
    }

    @Override
    public void enable()
    {
        enabled = true;
    }

    @Override
    public void disable()
    {
        enabled = false;
    }

    @Override
    public int getVolume()
    {
        return volume;
    }

    @Override
    public void setVolume(int percent)
    {
        this.volume = percent;
    }

    @Override
    public int getChannel()
    {
        return channel;
    }

    @Override
    public void setChannel(int channel)
    {
        this.channel = channel;
    }
}
