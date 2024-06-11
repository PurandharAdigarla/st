public class Employee implements Cloneable {
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        Employee s = new Employee(78, "PTR");
        System.out.println(s.id + " " + s.name);
        try {
            Employee s1 = (Employee)s.clone();
            System.out.println(s1.id + " " + s1.name);
        }catch (Exception e) {
            System.out.println(s.toString());
        }
    }
}