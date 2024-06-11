package assign8;
public class GetArea
{
    public static void main(String[] args) {
        Shape rect= new Rectangle(34,22);
        System.out.println("Area of rectangle: "+rect.getArea());
        Shape cir=new Circle(14);
        System.out.println("Area of Circle: "+cir.getArea());
        Shape tri=new Triangle(12,5);
        System.out.println("Area of Triangle: "+tri.getArea());
    }
}

