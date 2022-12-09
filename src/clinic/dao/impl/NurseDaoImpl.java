package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Nurse;
import java.sql.*;
import java.util.*;

public class NurseDaoImpl implements Dao<Nurse> {
  private Connection con;

  @Override
  public List<Nurse> get(String name) throws SQLException {
    con = DBConnection.createDBConnection();
    Nurse model = null;
    String query = "SELECT * FROM nurse WHERE first_name REGEXP ?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, ".*" + name + ".*");
    ResultSet rs = ps.executeQuery();

    int row = rs.getRow();
    List<Nurse> objectList = new ArrayList<Nurse>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      model = new Nurse(id, firstName, lastName, position);
      objectList.add(model);
    }

    return objectList;
  }

  @Override
  public List<Nurse> get() throws SQLException {
    con = DBConnection.createDBConnection();
    Nurse model = null;

    String query = "SELECT * FROM nurse";

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);

    int row = rs.getRow();

    List<Nurse> objectList = new ArrayList<Nurse>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      model = new Nurse(id, firstName, lastName, position);
      objectList.add(model);
    }

    return objectList;
  }

  @Override
  public List<List<String>> getList(String name) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM nurse WHERE first_name REGEXP ?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, ".*" + name + ".*");
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rsmd = rs.getMetaData();

    int row = rs.getRow();
    int col = rsmd.getColumnCount();
    List<List<String>> objectList = new ArrayList<List<String>>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      List<String> temp = new ArrayList<String>(col);
      temp.add(id);
      temp.add(firstName);
      temp.add(lastName);
      temp.add(position);
      objectList.add(temp);
    }

    return objectList;
  }

  @Override
  public List<List<String>> getList() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM nurse";

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);
    ResultSetMetaData rsmd = rs.getMetaData();

    int row = rs.getRow();
    int col = rsmd.getColumnCount();

    List<List<String>> objectList = new ArrayList<List<String>>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      List<String> temp = new ArrayList<String>(col);
      temp.add(id);
      temp.add(firstName);
      temp.add(lastName);
      temp.add(position);
      objectList.add(temp);
    }

    return objectList;
  }

  @Override
  public int insert(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query =
        "INSERT INTO nurse (first_name, last_name , position) VALUES (?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getFirstName());
    ps.setString(2, object.getLastName());
    ps.setString(3, object.getPosition());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int update(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "UPDATE nurse SET first_name = ?, last_name = ?, position = ? WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getFirstName());
    ps.setString(2, object.getLastName());
    ps.setString(3, object.getPosition());
    ps.setString(4, object.getId());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int delete(String id) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM nurse WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
