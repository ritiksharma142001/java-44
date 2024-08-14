import java.sql.*;
import java.util.Scanner;

public class JDBCSecondProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/jdbc_mydb";
        String user = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is established");

            while(true) {
            System.out.println("Enter the choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    insert(con);
                    break;
                case 2:
                    update(con);
                    break;
                case 3:
                    delete(con);
                    break;
                case 4:
                    fetchData(con);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insert(Connection con) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter course ID:");
            int c_id = scanner.nextInt();
            System.out.println("Enter course name:");
            String c_name = scanner.next();
            System.out.println("Enter trainer name:");
            String c_trainer = scanner.next();
            System.out.println("Enter course cost:");
            int c_cost = scanner.nextInt();

            String queryString = "INSERT INTO course (c_id, c_name, c_trainer, c_cost) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(queryString);
            pstmt.setInt(1, c_id);
            pstmt.setString(2, c_name);
            pstmt.setString(3, c_trainer);
            pstmt.setInt(4, c_cost);
            pstmt.executeUpdate();
            System.out.println("Data is inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Connection con) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter course ID to update:");
            int c_id = scanner.nextInt();
            System.out.println("Enter new course name:");
            String newName = scanner.next();
            System.out.println("Enter new trainer name:");
            String newTrainer = scanner.next();
            System.out.println("Enter new course cost:");
            int newCost = scanner.nextInt();

            String queryString = "UPDATE course SET c_name = ?, c_trainer = ?, c_cost = ? WHERE c_id = ?";
            PreparedStatement pstmt = con.prepareStatement(queryString);
            pstmt.setString(1, newName);
            pstmt.setString(2, newTrainer);
            pstmt.setInt(3, newCost);
            pstmt.setInt(4, c_id);
            pstmt.executeUpdate();
            System.out.println("Data is updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Connection con) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter course ID to delete:");
            int c_id = scanner.nextInt();

            String queryString = "DELETE FROM course WHERE c_id = ?";
            PreparedStatement pstmt = con.prepareStatement(queryString);
            pstmt.setInt(1, c_id);
            pstmt.executeUpdate();
            System.out.println("Data is deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchData(Connection con) {
        try {
            String queryString = "SELECT * FROM course";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(queryString);
            while (rs.next()) {
                int c_id = rs.getInt("c_id");
                String c_name = rs.getString("c_name");
                String c_trainer = rs.getString("c_trainer");
                int c_cost = rs.getInt("c_cost");
                System.out.println("ID: " + c_id + ", Name: " + c_name + ", Trainer: " + c_trainer + ", Cost: " + c_cost);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
