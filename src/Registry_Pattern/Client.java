package Registry_Pattern;

public class Client {
    public static final String INSTRUCTOR_KEY="instructor";
    public static final String STUDENT_KEY="student";
    public static void main(String[] args) {
        //Registry register=Registry.getInstance();
        createPrototype();
        createInstructor();
        createStudent();
    }

    public static void createPrototype() {
        Instructor ins=new Instructor("Saptarshi","a@b.com",new Address("kntpkr",711101),4.5);
        Registry.getInstance().register(INSTRUCTOR_KEY,ins);
        System.out.println(ins.toString());
        Student student=new Student("Rishav","c@d.com",new Address("GTR",712304),78.98);
        Registry.getInstance().register(STUDENT_KEY,student);
        System.out.println(student.toString());
    }

    public static void createInstructor() {
        Instructor ins_copy=(Instructor) Registry.getInstance().get(INSTRUCTOR_KEY).clone();
        ins_copy.setAddress(new Address("PNCHTL",711101));
        System.out.println(ins_copy.toString());
    }

    public static void createStudent() {
        Student student_copy=(Student) Registry.getInstance().get(STUDENT_KEY).clone();
        student_copy.setAddress(new Address("MNDRTL",711104));
        student_copy.setPsp(94);
        System.out.println(student_copy.toString());
    }
}
