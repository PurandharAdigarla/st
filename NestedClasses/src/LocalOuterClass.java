public class LocalOuterClass
{
    int i=34;

    public LocalOuterClass() {
    }
    public LocalOuterClass(int i) {
        this.i = i;
    }
    void show()
    {
        System.out.println("Outer class show");
    }
    void display()
    {
        System.out.println("Outer class display");
        class LocalInnerClass
        {
            int j=23;
            public LocalInnerClass() {
            }
            public LocalInnerClass(int j) {
                this.j = j;
            }
            void test()
            {
                System.out.println("Local Inner class test");
            }
        }
        LocalInnerClass lic= new LocalInnerClass();
        lic.test();
        System.out.println(lic.j);
    }
    public static void main(String[] args) {
        LocalOuterClass obj=new LocalOuterClass();
        obj.display();
    }
}
