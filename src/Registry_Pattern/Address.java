package Registry_Pattern;

public class Address {
    private String street;
    private int pin_code;

    public Address(String street, int pin_code) {
        this.street=street;
        this.pin_code=pin_code;
    }

    public Address(Address add) {
        this.street=add.street;
        this.pin_code=add.pin_code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPin_code() {
        return pin_code;
    }

    public void setPin_code(int pin_code) {
        this.pin_code = pin_code;
    }

    public String toString() {
        String ret="Street : "+getStreet()+" PIN : "+getPin_code();
        return ret;
    }
}
