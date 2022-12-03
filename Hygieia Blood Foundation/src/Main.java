import java.sql.*;

public class Main {

	public static void main(String[] args) {
		
		UserAndPass userNpass = new UserAndPass();
		
		LoginPage loginPage = new LoginPage(userNpass.getLoginInfo());
		
		try {
			//Getting connection to database
			Connection conn = DriverManager.getConnection("jdbc::mysql://localhost:3306/hygieia_foundation", "root", "joemama0008");
			//Create a statement
			Statement myStmt = conn.createStatement();
			//Execute sql query
			ResultSet myRs = myStmt.executeQuery("Select * from tbl_students;");
			//process the result set
			while(myRs.next());
			System.out.println(myRs.getString("LastName") + ", " + myRs.getString("FirstName"));
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		System.out.println("Loading driver...");

		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}

	}

}
