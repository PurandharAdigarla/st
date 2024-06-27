public class StudentAdd
{
    int dno;
    String city;
    String state;
    String county;

    public StudentAdd() {
    }

    public StudentAdd(int dno, String city, String state, String county) {
        this.dno = dno;
        this.city = city;
        this.state = state;
        this.county = county;
    }

    @Override
    public String toString() {
        return "StudentAdd{" +
                "dno=" + dno +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
