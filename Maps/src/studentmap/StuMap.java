package studentmap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StuMap
{
    public static void main(String[] args)
    {
        StudentAdd add1 = new StudentAdd(23, "uml", "Andhra Pradesh", "India");
        StudentAdd add2 = new StudentAdd(45, "lms", "Goa", "India");
        StudentAdd add3 = new StudentAdd(-29, "lulu", "Patna", "Sri Lanka");
        StudentAdd add4 = new StudentAdd(45, "inox", "California", "North America");
        StudentAdd add5 = new StudentAdd(9, "pivn", "Oolalalallala", "Upiri");

        Student st1 = new Student(3, "Ptr", "CSE", add1);
        Student st2 = new Student(1, "Abhi", "ECE", add2);
        Student st3 = new Student(5, "Teja", "Civil", add3);
        Student st4 = new Student(2, "Ravi", "MEC", add4);
        Student st5 = new Student(4, "Jayanth", "IT", add5);

        LinkedHashMap<Student,Integer> stad=new LinkedHashMap<Student,Integer>();
        TreeMap<Student,Integer> treestad=new TreeMap<Student,Integer>(new StuIdCompare());

        stad.put(st1,1);
        stad.put(st2,4);
        stad.put(st3,5);
        stad.put(st4,3);
        stad.put(st5,2);

        treestad.put(st1,1);
        treestad.put(st2,4);
        treestad.put(st3,5);
        treestad.put(st4,3);
        treestad.put(st5,2);

        System.out.println("Linked HashMap");
        for(Map.Entry<Student,Integer> map:stad.entrySet())
        {
            System.out.println(map.getKey()+" "+map.getValue());
        }

        System.out.println();
        System.out.println("Tree Map");
        for (Map.Entry<Student,Integer> treemap:treestad.entrySet())
        {
            System.out.println(treemap.getKey()+" "+treemap.getValue());
        }
    }
}
