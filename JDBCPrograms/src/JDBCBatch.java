import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCBatch {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_mydb";
        String user = "root";
        String password = "root";

        try {
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");

            // Creating query
            String queryString = "INSERT INTO course (c_id, c_name, c_trainer, c_cost) VALUES (?, ?, ?, ?)";

            // Preparing the query
            PreparedStatement pstmt = connection.prepareStatement(queryString);

            System.out.println("Enter number of rows to be inserted:");
            int rowCount = scanner.nextInt();

            // Loop to get input for each row
            for (int i = 1; i <= rowCount; i++) {
                System.out.println("Enter details for row " + i + ":");

                System.out.println("Enter course ID:");
                int c_id = scanner.nextInt();
                System.out.println("Enter course name:");
                String c_name = scanner.next();
                System.out.println("Enter trainer name:");
                String c_trainer = scanner.next();
                System.out.println("Enter course cost:");
                int c_cost = scanner.nextInt();

                // Setting parameters
                pstmt.setInt(1, c_id);
                pstmt.setString(2, c_name);
                pstmt.setString(3, c_trainer);
                pstmt.setInt(4, c_cost);

                // Adding to batch
                pstmt.addBatch();
            }

            // Executing batch
            pstmt.executeBatch();
            System.out.println("Batch insert completed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
