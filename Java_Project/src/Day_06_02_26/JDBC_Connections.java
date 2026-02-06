package Day_06_02_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC_Connections {

	public static void main(String[] args) throws Exception {
		
		//Loading Driver
		String url="jdbc:mysql://localhost:3306/studentdb";
		String url1="jdbc:oracle:thin:@localhost:1521:xe";
		String username = "root"; // MySQL credentials
        String password = "Mayur@123";
        String query="select * from student";
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");
            // Create a statement
            Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(query);
        while (rs.next()) {
          
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(4)); // Print result on console
        }
        
        // Close the statement and connection
        st.close();
        con.close();
        System.out.println("Connection Closed....");

	}

}
