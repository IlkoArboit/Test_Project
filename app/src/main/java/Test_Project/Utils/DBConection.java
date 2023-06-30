package Test_Project.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBConection {
    private static final Logger logger = LoggerFactory.getLogger(DBConection.class);
    private static final String DATABASE_URL = "jdbc:mysql://127.0.2.1:3306/IESDatabase";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            logger.info("Conexión exitosa a la base de datos");
            return connection;
        } catch (ClassNotFoundException e) {
            logger.error("Error al establecer la conexión a la base de datos", e);
        }
    }

    public static ResultSet executeQuery(String query) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            connection = getConnection();
            statement = connection.prepareStatement(query);
            result = statement.executeQuery();

            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            closeResources(connection, statement, result);
        }
    
        return null;
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
