package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Nurse;
import java.sql.*;
import java.util.*;

public class NurseDaoImpl implements Dao<Nurse> {
  Connection con;

  @Override
  public Nurse get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Nurse model = null;

    String query =
        "SELECT employee.id, employee.first_name, employee.last_name, nurse.position FROM nurse INNER JOIN employee ON employee.id = nurse.id WHERE employee.id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String nurseId = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      model = new Nurse(nurseId, firstName, lastName, position);
    }

    return model;
  }

  @Override
  public List<Nurse> get() throws SQLException {
    con = DBConnection.createDBConnection();
    Nurse model = null;

    String query =
        "SELECT employee.id, employee.first_name, employee.last_name, nurse.position FROM nurse INNER JOIN employee ON employee.id = nurse.id ORDER BY employee.id ASC";

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
  public List<String> getList(String id) throws SQLException {
    Nurse model = get(id);
    List<String> data = new ArrayList<String>();
    data.add(model.getId());
    data.add(model.getFirstName());
    data.add(model.getLastName());
    data.add(model.getPosition());

    return data;
  }

  @Override
  public List<List<String>> getList() throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "SELECT employee.id, employee.first_name, employee.last_name, nurse.position FROM nurse INNER JOIN employee ON employee.id = nurse.id ORDER BY employee.id ASC";

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
        "INSERT INTO employee (id, first_name, last_name) VALUE (?, ?, ?); INSERT INTO nurse (id, position) VALUES (?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getId());
    ps.setString(2, object.getFirstName());
    ps.setString(3, object.getLastName());
    ps.setString(4, object.getId());
    ps.setString(5, object.getPosition());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int update(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "UPDATE nurse SET position = ? WHERE id = ?; UPDATE employee SET first_name = ?, last_name = ? WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getPosition());
    ps.setString(2, object.getId());
    ps.setString(3, object.getFirstName());
    ps.setString(4, object.getLastName());
    ps.setString(5, object.getId());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int delete(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query =
        "DELETE FROM employee, nurse USING nurse INNER JOIN employee ON employee.id = nurse.id WHERE nurse.id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getId());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
