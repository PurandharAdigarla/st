package employeeAddressSort;
public class Address
{
    int dno;
    String street;
    String State;

    public Address() {
    }
    public Address(int dno, String street, String state) {
        this.dno = dno;
        this.street = street;
        State = state;
    }
    @Override
    public String toString() {
        return "Address{" +
                "dno=" + dno +
                ", street='" + street + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}

