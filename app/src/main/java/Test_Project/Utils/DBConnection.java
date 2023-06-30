package Test_Project.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    private static final String DATABASE_URL = "jdbc:mysql://127.0.2.1:3306/IESDatabase";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            
            return connection;
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
        return null;
    }

    public static ResultSet executeQuery(String query) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            connection = getConnection();
            statement = connection.prepareStatement(query);
            result = statement.executeQuery();
            logConnection("Conexión exitosa", query);

            return result;
        } catch (SQLException e) {
            logConnection("Conexión fallida", query);
            e.printStackTrace();
            closeResources(connection, statement, result);
        }

        return null;
    }

    public static void logConnection(String title, String description) {
        String insertQuery = "INSERT INTO logs (title, description, id_user, date) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, title);
            preparedStatement.setString(2, description);
            preparedStatement.setInt(3, 6);
            preparedStatement.setString(4, LocalDate.now().toString());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeResources(Connection connection, PreparedStatement statement, ResultSet result) {
        try {
            if (result != null) {
                result.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
