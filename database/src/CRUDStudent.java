import java.sql.*;
public class CRUDStudent {
    public void CreateStudent(int id,String name,String email,String gender)
    {
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikdb?useSSL= false","root","root");
            String sql="insert into student(ID,Name,Email,Gender) values(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,"Name");
            ps.setString(3,"Email");
            ps.setString(4,"Gender");
            ps.executeUpdate();
            con.close();
            System.out.println("Data Inserted");
      }
      catch (Exception e){
            System.out.println(e);
         }
    }

    
}