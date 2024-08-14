// importing sql package
import java.sql.*;
public class JDBCFirstProgram {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc_mydb";
		String user = "root";
		String password = "root";
// 		String queryString = "CREATE TABLE STUDENT(Roll INT, NAME VARCHAR(20), AGE INT)";
// 		String queryString = "INSERT INTO STUDENT VALUES(1, 'RITIK', 23),(2, 'Eshu', 25)";
// 		String queryString = "UPDATE STUDENT SET AGE = 26 WHERE ROLL = 1";
// 		String queryString = "UPDATE STUDENT SET NAME = 'MOHITH' WHERE ROLL = 2";
// 		String queryString = "DELETE FROM STUDENT WHERE ROLL=2";
		String queryString = "SELECT *FROM STUDENT";


		try {
			//loading the driver
//			Class.forName("com.mysql.cj.jdbc.Driver"); //path of driver
//			System.out.println("Driver is loaded");
			
			//establishing the connection
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection is establised");
			//creating the statement using connection
			Statement statement = connection.createStatement();
			
			//executing the query using statement
//			statement.execute(queryString);
			
			ResultSet resultSet = statement.executeQuery(queryString);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
			}
			System.out.println("Query is executed");
//			System.out.println("Table has been executed executed");
//			System.out.println("Table has been executed executed");
//			System.out.println("Data is inserted");

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
