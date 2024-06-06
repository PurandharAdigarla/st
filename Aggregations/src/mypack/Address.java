package mypack;

public class Address
{
    int hno;
    String street;
    String district;
    String state;
    String country;
    int pincode;

    public Address()
    {
        super();
    }
    public Address(int hno, String street, String district, String state, String country, int pincode) {
        this.hno = hno;
        this.street = street;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "hno=" + hno +
                ", street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
