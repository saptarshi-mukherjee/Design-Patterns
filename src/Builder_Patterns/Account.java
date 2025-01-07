package Builder_Patterns;

public class Account {

    //Mandatory
    private String username;
    private String password;
    private double balance;  // Always greater than 0
    private int age; // Always Greater than 18

    //Optional
    private String address;
    private double annual_income;

    private Account(Builder builder) {
        this.username=builder.username;
        this.password=builder.password;
        this.balance=builder.balance;
        this.age=builder.age;
        this.address=builder.address;
        this.annual_income=builder.annual_income;
    }

    static class Builder {
        private String username;
        private String password;
        private double balance;  // Always greater than 0
        private int age; // Always Greater than 18

        //Optional
        private String address;
        private double annual_income;

        public Builder setUsername(String username) {
            this.username=username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password=password;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance=balance;
            return this;
        }

        public Builder setAge(int age) {
            this.age=age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address=address;
            return this;
        }

        public Builder setAnnual_income(double annual_income) {
            this.annual_income=annual_income;
            return this;
        }

        public Account build() throws Exception {
            if(this.balance<=0)
                throw new Exception("Balance must be higher and greater than 0");
            if(this.username==null || this.password==null)
                throw new Exception("Mandatory fields absent");
            if(this.age<18)
                throw new Exception("Minors cannot own bank accounts");
            return new Account(this);
        }
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getAnnual_income() {
        return annual_income;
    }
}
