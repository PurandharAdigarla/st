public  class Greeter implements GreetingAnonymousInnerInterface
{
    public void sayHello(){}
    void greet()
        {
            Greeter obj=new Greeter() {
                @Override
                public void sayHello() {
                    System.out.println("Hello world!");
                }
            };
            obj.sayHello();
        }
    public static void main(String[] args) {
        Greeter obj= new Greeter();
        obj.greet();
    }
}

