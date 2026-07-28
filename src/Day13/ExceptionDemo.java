package Day13;
import java.io.IOException;

public class ExceptionDemo{
    // Method with throws
    public static void readFile() throws IOException {
        throw new IOException("File Not Found");
    }
    public static void main(String[] args) {
        // 1. Checked Exception
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        }
        System.out.println("----------------------------");

        // 2. ArithmeticException (Custom Logic)
        try {
            int[] amount = {10000, 13000, 4000};
            for (int money : amount) {
                if (money > 10000) {
                    throw new ArithmeticException("Limit Exceeded");
                }
                System.out.println("Collect your amount : " + money);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Finished");
        }
        System.out.println("----------------------------");
        // 3. Custom Exception
        int age = 17;
        try {
            if (age < 18) {
                throw new AgeException("Not Eligible");
            }
            System.out.println("Eligible");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------");
        System.out.println("Program Ended Successfully");
    }
}

// Custom Exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}