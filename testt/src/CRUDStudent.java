import java.sql.*;

public class CRUDStudent {
      public void CreateStudent(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikdb?useSSL=false","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            con.close();
         }
         catch (Exception e){
            System.out.println(e);
         }
      }
}
