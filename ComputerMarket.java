import java.util.Scanner;
class ComputerMarket 
{
    String brand;
    int price;
    String model;
    ComputerMarket()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Available Brands: HP, Dell, Asus");
        this.brand = sc.nextLine();
        if ((this.brand=="HP")||(this.brand=="hp")) 
        {
            System.out.println("Please enter your price range. \n INR 30000-50000 \n INR 50000-100000 \n INR 100000 above");
            this.price=sc.nextInt();
            if ((this.price>=30000) && (this.price<=50000)) 
            {
                System.out.println("These are the avaiable models in price range 30000-50000");
                System.out.println("Select the models: HP Model A, HP Model B");
                this.model=sc.nextLine();
                if ((this.model=="HP Model A")||(this.model=="hp model a")) 
                {
                    System.out.println("HP Model A, INR 36,000, 8GB RAM, 512GB SSD, Intel i5");
                }
                if ((this.model=="HP Model B")||(this.model=="hp model b")) 
                {
                    System.out.println("HP Model b, INR 36,000, 8GB RAM, 512GB SSD, Intel i5");
                }
            }
            else if ((this.price>50000)&&(this.price<=100000)) 
            {
                System.out.println("These are the avaiable models in price range 50000-100000");
                System.out.println("Select the models: HP Model C, HP Model D");
                this.model=sc.nextLine();
                if ((this.model=="HP Model C")||(this.model=="hp model d")) 
                {
                    System.out.println("HP Model C, INR 57,999, 16GB RAM, 512GB SSD, Intel i5");
                }
                else if ((this.model=="HP Model D")||(this.model=="hp model d")) 
                {
                    System.out.println("HP Model D, INR 59,999, 16GB RAM, 512GB SSD, Intel i5");
                }
            }
            else
            {
                System.out.println("Not found");
            }
        }
        else
            {
                System.out.println("Not found");
            }
    }
    public static void main(String[] args)
{
    ComputerMarket obj=new ComputerMarket();
}
}

