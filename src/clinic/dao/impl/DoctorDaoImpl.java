package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Doctor;
import java.sql.*;
import java.util.*;

public class DoctorDaoImpl implements Dao<Doctor> {
  Connection con;

  @Override
  public Doctor get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Doctor doc = null;
    String query =
        "SELECT employee.id, employee.first_name, employee.last_name, doctor.position FROM doctor INNER JOIN employee ON employee.id = doctor.id WHERE employee.id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String doctorID = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      doc = new Doctor(doctorID, firstName, lastName, position);
    }

    return doc;
  }

  @Override
  public ArrayList<String> getArrayList(String id) throws SQLException{
    Doctor model = get(id);
    ArrayList<String> data = new ArrayList<String>();
    data.add(model.getID());
    data.add(model.getFirstName());
    data.add(model.getLastName());
    data.add(model.getPosition());

    return data;
  }

  @Override
  public ArrayList<ArrayList<String>> getAll() throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "SELECT employee.id, employee.first_name, employee.last_name, doctor.position FROM doctor INNER JOIN employee ON employee.id = doctor.id ORDER BY employee.id ASC";

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);
    ResultSetMetaData rsmd = rs.getMetaData();

    int row = rs.getRow();
    int col = rsmd.getColumnCount();

    ArrayList<ArrayList<String>> objectList = new ArrayList<ArrayList<String>>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      ArrayList<String> temp = new ArrayList<String>(col);
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
    ps.setString(1, object.getID());
    ps.setString(2, object.getFirstName());
    ps.setString(3, object.getLastName());
    ps.setString(4, object.getID());
    ps.setString(5, object.getPosition());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int update(Doctor object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "UPDATE doctor SET position = ? WHERE id = ?; UPDATE employee SET first_name = ?, last_name = ? WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getPosition());
    ps.setString(2, object.getID());
    ps.setString(3, object.getFirstName());
    ps.setString(4, object.getLastName());
    ps.setString(5, object.getID());

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
    ps.setString(1, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
