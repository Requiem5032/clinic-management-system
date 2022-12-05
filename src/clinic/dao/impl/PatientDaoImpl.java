package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Patient;
import java.sql.*;
import java.util.*;

public class PatientDaoImpl implements Dao<Patient> {
  private Connection con;

  @Override
  public Patient get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Patient model = null;

    String query = "SELECT * FROM patient WHERE pid = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String pid = rs.getString("pid");
      String nid = rs.getString("nid");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      int age = rs.getInt("age");
      boolean gender = rs.getBoolean("gender");
      String addr = rs.getString("address");

      model = new Patient(pid, nid, firstName, lastName, age, gender, addr);
    }

    return model;
  }

  @Override
  public List<Patient> get() throws SQLException {
    con = DBConnection.createDBConnection();
    Patient model = null;

    String query = "SELECT * FROM patient ORDER BY pid ASC";

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);

    int row = rs.getRow();

    List<Patient> objectList = new ArrayList<Patient>(row);

    while (rs.next()) {
      String pid = rs.getString("pid");
      String nid = rs.getString("nid");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      int age = rs.getInt("age");
      boolean gender = rs.getBoolean("gender");
      String addr = rs.getString("address");

      model = new Patient(pid, nid, firstName, lastName, age, gender, addr);
      objectList.add(model);
    }

    return objectList;
  }

  @Override
  public List<String> getList(String id) throws SQLException {
    Patient model = get(id);
    List<String> data = new ArrayList<String>();

    data.add(model.getPid());
    data.add(model.getNid());
    data.add(model.getFirstName());
    data.add(model.getLastName());
    int tempAge = model.getAge();
    data.add(Integer.toString(tempAge));
    String gender = null;
    if (model.getGender() == false) {
      gender = "Female";
    } else {
      gender = "Male";
    }
    data.add(gender);
    data.add(model.getAddr());

    return data;
  }

  @Override
  public List<List<String>> getList() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM patient ORDER BY pid ASC";

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);
    ResultSetMetaData rsmd = rs.getMetaData();

    int row = rs.getRow();
    int col = rsmd.getColumnCount();

    List<List<String>> objectList = new ArrayList<List<String>>(row);

    while (rs.next()) {
      String pid = rs.getString("pid");
      String nid = rs.getString("nid");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      int tempAge = rs.getInt("age");
      boolean tempGender = rs.getBoolean("gender");
      String age = Integer.toString(tempAge);
      String gender;
      if (tempGender == false) {
        gender = "Female";
      } else {
        gender = "Male";
      }
      String addr = rs.getString("address");

      List<String> temp = new ArrayList<String>(col);
      temp.add(pid);
      temp.add(nid);
      temp.add(firstName);
      temp.add(lastName);
      temp.add(age);
      temp.add(gender);
      temp.add(addr);
      objectList.add(temp);
    }

    return objectList;
  }

  @Override
  public int insert(Patient object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "INSERT INTO patient (pid, nid, first_name, last_name, age, gender, address) VALUES (?, ?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getPid());
    ps.setString(2, object.getNid());
    ps.setString(3, object.getFirstName());
    ps.setString(4, object.getLastName());
    ps.setInt(5, object.getAge());
    ps.setBoolean(6, object.getGender());
    ps.setString(7, object.getAddr());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int update(Patient object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "UPDATE patient SET nid = ?, first_name = ?, last_name = ?, age = ?, gender = ?, address = ? WHERE pid = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getNid());
    ps.setString(2, object.getFirstName());
    ps.setString(3, object.getLastName());
    ps.setInt(4, object.getAge());
    ps.setBoolean(5, object.getGender());
    ps.setString(6, object.getAddr());
    ps.setString(7, object.getPid());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int delete(Patient object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM patient WHERE pid = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getPid());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
