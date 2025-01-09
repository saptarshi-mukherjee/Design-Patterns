package Registry_Pattern;

public abstract class User {
    private String name, email;
    Address address;

    public User(String name, String email, Address add) {
        this.name = name;
        this.email = email;
        this.address=new Address(add);
    }

    public User(User user) {
        this.name=user.name;
        this.email=user.email;
        this.address=new Address(user.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = new Address(address);
    }

    public abstract User clone();
}
