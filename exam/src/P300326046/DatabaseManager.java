package P300326046;

import java.sql.*;

public class DatabaseManager {

    /*
     * @Description: Attributes:
     */

    private String dbAbsolutePath;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    // Constructor:
    public DatabaseManager(String absolutePath) {
        this.dbAbsolutePath = absolutePath;
    }

    // Create the connection:
    public void ConnectDB() throws Exception {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        this.connection = DriverManager.getConnection("jdbc:ucanaccess://"+this.dbAbsolutePath);
        this.statement = connection.createStatement();
        this.resultSet = null;
    }

    // Close the connection:
    public void CloseDB() throws Exception {
        if(connection!=null) {
//            resultSet.close();
            statement.close();
            connection.close();
        }
    }

    /*
     * @Description: CRUD implementation is based on the query: (only the query method suffice!)
     */

    public ResultSet QueryMethod(String query) throws SQLException {
        if(query.contains("SELECT")) {
            return statement.executeQuery(query);
        } else {
            statement.executeUpdate(query);
            return null;
        }
    }

    /*
     * @Description: Display the table:
     */
    public void DisplayTableFromDB(ResultSet resultSet) throws SQLException {
        if(this.resultSet != null) {
            while (this.resultSet.next()) {
                System.out.println(this.resultSet.getString("StudentName"));
            }
        }
    }
}
