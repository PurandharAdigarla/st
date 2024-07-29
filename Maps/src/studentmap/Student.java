public class Student implements Comparable<Student>
{
    int id;
    String name;
    String branch;
    StudentAdd address;

    public Student() {
    }

    public Student(int id, String name, String branch, StudentAdd address) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Student o)
    {
//        return this.name.compareTo(o.name);

        if(this.id>o.id)
            return 9;
        else if (this.id<o.id)
            return -9;
        else
            return 0;
    }
}