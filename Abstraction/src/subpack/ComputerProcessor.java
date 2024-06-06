package subpack;
public class ComputerProcessor extends ComputerOS
{
    public String compProcessor()
    {
        System.out.println("Intel i5 gen 8");
        return "Intel i5 gen 8";
    }

    public static void main(String[] args) {
        ComputerProcessor obj= new ComputerProcessor();
        obj.compType();
        obj.compBrand();
        obj.compOS();
        obj.compProcessor();
    }
}
