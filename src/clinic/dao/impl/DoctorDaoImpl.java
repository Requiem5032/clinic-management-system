package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Doctor;
import java.sql.*;
import java.util.*;

public class DoctorDaoImpl implements Dao<Doctor> {
  private Connection con;

  @Override
  public Doctor get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Doctor model = null;
    String query =
        "SELECT employee.id, employee.first_name, employee.last_name, doctor.position FROM doctor INNER JOIN employee ON employee.id = doctor.id WHERE employee.id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String doctorId = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      model = new Doctor(doctorId, firstName, lastName, position);
    }

    return model;
  }

  @Override
  public List<Doctor> get() throws SQLException {
    con = DBConnection.createDBConnection();
    Doctor model = null;

    String query =
        "SELECT employee.id, employee.first_name, employee.last_name, doctor.position FROM doctor INNER JOIN employee ON employee.id = doctor.id ORDER BY employee.id ASC";

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);

    int row = rs.getRow();

    List<Doctor> objectList = new ArrayList<Doctor>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      model = new Doctor(id, firstName, lastName, position);
      objectList.add(model);
    }

    return objectList;
  }

  @Override
  public List<String> getList(String id) throws SQLException {
    Doctor model = get(id);
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
        "SELECT employee.id, employee.first_name, employee.last_name, doctor.position FROM doctor INNER JOIN employee ON employee.id = doctor.id ORDER BY employee.id ASC";

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
  public int insert(Doctor object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query =
        "INSERT INTO employee (id, first_name, last_name) VALUE (?, ?, ?); INSERT INTO doctor (id, position) VALUES (?, ?)";

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
  public int update(Doctor object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "UPDATE doctor SET position = ? WHERE id = ?; UPDATE employee SET first_name = ?, last_name = ? WHERE id = ?";

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
  public int delete(Doctor object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query =
        "DELETE FROM employee, doctor USING doctor INNER JOIN employee ON employee.id = doctor.id WHERE doctor.id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getId());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
