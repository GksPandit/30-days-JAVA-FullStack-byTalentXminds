package Day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "password";

        try{
            // stores active connection
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );
            System.out.println("Database Connected Successfully");
            String sql = "INSERT INTO students VALUES(?,?,?,?,?,?)";


            //-----------------CREATE----------------------------
        /*    PreparedStatement ps = con.prepareStatement(sql);
            // student 1.
            ps.setInt(1,7);
            ps.setString(2, "Keshav");
            ps.setString(3,"Keshav@gmail.com");
            ps.setString(4,"Delhi");
            ps.setInt(5,24);
            ps.setInt(6,3);
            // student 2.
            ps.setInt(1,2);
            ps.setString(2, "Jikesh");
            ps.setString(3,"jikesh@gmail.com");
            ps.setString(4,"greater Noida");
            ps.setInt(5,22);
            ps.setInt(6,2);

            ps.executeUpdate();
            System.out.println("Student Created!");*/

//-----------------UPDATE----------------------------
            String update = "UPDATE students SET city=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(update);
            ps.setInt(2,7);
            ps.setString(1,"Amritsar");

            ps.executeUpdate();
            System.out.println("Student updated!");

            int id = 7;
//------------------DELETE------------------------------
            String deleteQ = "DELETE FROM students WHERE id="+id;
            PreparedStatement psDelete = con.prepareStatement(deleteQ);
            // psDelete.setInt(1, 7); // because they are secure
            psDelete.executeUpdate();
            System.out.println("Deleted");

//-------------------READ--------------------------------------
            String readQuery = "SELECT * FROM students";
            PreparedStatement psRead = con.prepareStatement(readQuery);

            ResultSet rs = psRead.executeQuery();
            System.out.println("Id | Name | Email | City | Age | Dept_id");
            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+" "
                                + rs.getString("name")+" "
                                + rs.getString("email")+" "
                                + rs.getString("city")+" "
                                + rs.getInt("age")+" "
                );
            }


            con.close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
