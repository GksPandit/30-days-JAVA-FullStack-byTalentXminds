package Day10;

public class SchoolStudent extends Student{
    private String schoolName;
    private float fees;

    public SchoolStudent(String schoolName, float fees, String name, int age){
        super(name,age);

        System.out.println("School student created");

        this.schoolName = schoolName;
        this.fees = fees;


    }
    public String getName(){
        return "Example";
    }
    @Override
    public String toString() {
        return "School Student{" +
                " Name='" + super.getName() + '\'' +
                ", Age='" + getAge() + '\'' +
                ", School Name='" + schoolName + '\'' +
                ", Fees=" + fees  +
                '}';
    }
}

