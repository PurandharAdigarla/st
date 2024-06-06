package subpack;
import mainpack.*;
public abstract class TypeOfComputer extends Computer
{
    @Override
    public String compType()
    {
        System.out.println("Laptop");
        return "Laptop";
    }
}
