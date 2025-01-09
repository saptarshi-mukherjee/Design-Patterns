package Registry_Pattern;

public class Student extends User {

    private double psp;

    public Student(String name, String email, Address address, double psp) {
        super(name,email,address);
        this.psp=psp;
    }

    public Student(Student s) {
        super(s);
        this.psp=s.psp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String toString() {
        String ret=getName()+" "+getEmail()+" "+getAddress().toString()+" "+getPsp();
        return ret;
    }
}
