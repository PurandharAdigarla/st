public class StaticAndNonStatic 
{
    //global variables can be left uninitialsed  but the local variables must be initailised.
    static int b;                       // static variable
    int a=5;                            //non-static variable(Instance)  
    void main(){                        //non-static variable
        b=20;
        a+=b;
        System.out.println(a);
    }
    static int main(int a)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        StaticAndNonStatic objme=new StaticAndNonStatic(); //object 1
        objme.main();
        StaticAndNonStatic obj=new StaticAndNonStatic();  //object 2
        System.out.println(obj.a);
        System.out.println(b);
        System.out.println(main(35));
    }
}
