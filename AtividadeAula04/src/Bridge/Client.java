package Bridge;

public class Client
{
    public static void main(String[] args)
    {
        Tv tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);

        remote.togglePower();
        System.out.println(remote.device.isEnabled());
        remote.togglePower();
        System.out.println(remote.device.isEnabled());

        Radio radio = new Radio();
        AdvancedRemoteControl adv_remote = new AdvancedRemoteControl(radio);

        adv_remote.togglePower();
        System.out.println(adv_remote.device.isEnabled());
    }
}
