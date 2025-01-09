package Registry_Pattern;

public class Instructor extends User {

    private double avg_rating;

    public Instructor(String name, String email, Address add, double rating) {
        super(name,email,add);
        this.avg_rating=rating;
    }

    public Instructor(Instructor ins) {
        super(ins);
        this.avg_rating=ins.avg_rating;
    }

    public double getAvg_rating() {
        return avg_rating;
    }

    public void setAvg_rating(double avg_rating) {
        this.avg_rating = avg_rating;
    }

    @Override
    public Instructor clone() {
        return new Instructor(this);
    }

    public String toString() {
        String ret=getName()+" "+getEmail()+" "+getAddress().toString()+" "+getAvg_rating();
        return ret;
    }
}
