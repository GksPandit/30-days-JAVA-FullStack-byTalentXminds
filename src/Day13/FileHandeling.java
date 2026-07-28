package Day13;
import java.io.*;
import java.util.Scanner;


public class FileHandeling {

  public   static void main(String[] args) throws IOException {
        String fileName = "Student.txt";
        File file = new File(fileName);

        //creating new file
        if(file.createNewFile()){
            System.out.println("File Created");
        }else{
            System.out.println("Already Exists");
        }
        System.out.println(file.exists());

        // write data inside our file
        ///  initialize writer
        FileWriter writer = new FileWriter(file);
        writer.write("Welcome to talentxminds");
        //close connection
        writer.close();
        // append data
        FileWriter writer2 = new FileWriter(fileName,true);
        writer2.write(", I am learning fullstack.");
        //close connection
        writer2.close();
        // read file using scanner class
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.append("Java");
        bw.newLine();
        bw.append("Spring boot");
        bw.close();
        BufferedReader br1= new BufferedReader(new FileReader(fileName));

        while ((line = br1.readLine())!= null){
            System.out.println(line);
        }
        br1.close();
        if(file.delete()){
            System.out.println("Deleted");
        }
    }
}
