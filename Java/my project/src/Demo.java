import java.sql.*;
public class Demo
{
public static void main(String[] args) throws Exception
{
     String query="select username from student where userid=3";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "vishal@123");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery(query);
   rs.next();
      String name=rs.getString("username");
      System.out.println(name);
      st.close();
      con.close();
}
}
