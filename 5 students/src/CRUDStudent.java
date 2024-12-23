import java.sql.*;
public class CRUDStudent {
    public void CreateStudent(int id, String name, String email, String gender)
    {
        try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikdb?useSSL=false","root","root");  
        String sql="insert into student(ID,Name,Email,Gender) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.executeUpdate();
            con.close();
            System.out.println("Data Inserted");
        }
        catch(Exception e){ System.out.println(e);}  
    } 
    public void FetchStudent()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikdb?useSSL=false","root","root");  
            
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from student");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+ "  "+rs.getString(4));  
            con.close();  
            }
            catch(Exception e){ System.out.println(e);}  
            }  

    }