
// -----------Inheritance---------

package Day10;

public class CollegeStudent extends Student{
    private String collegeName;
    private float fees;

    public CollegeStudent(String collegeName, float fees, String name, int age) {
        super(name,age);
        this.collegeName = collegeName;
        this.fees = fees;
    }
    public void admission(){
        System.out.println("College admission");
    }
    public String getName(){
        return "Example";
    }
    @Override
    public String toString() {
        return "CollegeStudent{" +
                " Name='" + super.getName() + '\'' +
                ", Age='" + getAge() + '\'' +
                ", College Name='" + collegeName + '\'' +
                ", Fees=" + fees  +
                '}';
    }
}
