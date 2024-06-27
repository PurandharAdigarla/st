public class Device
{
    interface Battery
    {
        void charge();
    }
}
class Phone implements Device.Battery
{
    @Override
    public void charge()
    {
        System.out.println("phone is charging");
    }
    public static void main(String[] a)
    {
        Phone p=new Phone();
        p.charge();
    }
}