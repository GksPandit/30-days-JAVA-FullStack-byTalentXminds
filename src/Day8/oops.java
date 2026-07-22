
package Day8;
public class oops {

    public static void main(String[] args) {

        // Arrays
        int[] rollNo = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        // Objects
        Student student1 = new Student(1, "Nikhil", 87.6);
        Student student2 = new Student(2, "Rahul", 99);

        // Update marks
        student1.marks = 90.5f;

        // Print objects
        System.out.println(student1);
        System.out.println(student2);
    }
}

// Blueprint
class Student {

    // Properties
    int rollNo;
    String name;
    double marks;

    // Constructor
    public Student(int rollNo, String name, double marks) {

        System.out.println("Constructor Called");

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {

        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}