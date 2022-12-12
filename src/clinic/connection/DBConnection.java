package clinic.connection;

import java.sql.*;

public class DBConnection {
  static Connection con;

  /** Database URL */
  private static String url = "jdbc:mysql://localhost:3306/clinic";

  /** MySQL database username */
  private static String username = "root";

  /** MySQL database password */
  private static String password = "0";

  public static Connection createDBConnection() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, username, password);
    } catch (Exception e) {
      System.out.print(e);
    }
    return con;
  }

  public static void closeConnection(Connection con) throws SQLException {
    con.close();
  }

  public static void closeStatement(Statement stmt) throws SQLException {
    stmt.close();
  }

  public static void closePreparedStatement(PreparedStatement ps) throws SQLException {
    ps.close();
  }

  public static void closeResultSet(ResultSet rs) throws SQLException {
    rs.close();
  }
}
