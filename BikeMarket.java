import java.util.Scanner;
public class BikeMarket 
{
    void KTM(int a, String model){
        switch(a) {
            case 1: {    
                switch (model) {
                    case "RC200":
                        System.out.println("CC - 200cc");
                        break;
                    case "Duke200":
                        System.out.println("CC - 198cc");
                        break;
                    default:
                        System.out.println("Bike not found");
                }}
            break;
            case 2:{
                switch (model) {
                    case "RC390":
                        System.out.println("CC - 379cc");
                        break;
                    case "Duke250":
                        System.out.println("CC - 249cc");
                        break;
                    default:
                        System.out.println("Bike not found");
                }}
            break;
            default:
                System.out.println("Range not found");
        }
    }   
    public static void main(String[] args) {
        System.out.println("Welcome to the Bike Market");
        System.out.println("Enter 1 to view price range from 1.5-2.5 lakh \nEnter 2 to view price above 2.5 lakh");
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        String model=sc.next();
        BikeMarket bike=new BikeMarket();
        bike.KTM(price,model);
    } 
}
