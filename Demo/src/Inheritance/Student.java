package Inheritance;
public class Student
{
    int id;
    String name;
    String place;
    String dept;
    public Student()
    {
    }
    public Student(int id) {
        this.id = id;
    }
    public Student(int id, String name) {
        this(id);
        this.name = name;
    }
    public Student(int id, String name, String place, String dept) {
        this(id, name);
        this.place = place;
        this.dept = dept;
    }
}
class StudentCourse extends Student
{
    String branch;
    String elective;
    String Project;
    public StudentCourse() {
    }
    public StudentCourse(String branch, String elective) {
        this.branch = branch;
        this.elective = elective;
    }
    public StudentCourse(int id, String name, String place, String dept, String branch, String elective, String project) {
        super(id, name, place, dept);
        this.Project = project;
    }
}
