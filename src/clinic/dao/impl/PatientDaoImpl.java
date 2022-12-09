package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Patient;
import java.sql.*;
import java.util.*;

public class PatientDaoImpl implements Dao<Patient> {
  private Connection con;

  @Override
  public List<Patient> get(String name) throws SQLException {
    con = DBConnection.createDBConnection();
    Patient model = null;
    String query = "SELECT * FROM patient WHERE first_name REGEXP ?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, ".*" + name + ".*");
    ResultSet rs = ps.executeQuery();

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
  public List<Patient> get() throws SQLException {
    con = DBConnection.createDBConnection();
    Patient model = null;

    String query = "SELECT * FROM patient";

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
  public List<List<String>> getList(String name) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM patient WHERE first_name REGEXP ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, ".*" + name + ".*");
    ResultSet rs = ps.executeQuery();
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
  public List<List<String>> getList() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM patient";

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
        "INSERT INTO patient (nid, first_name, last_name, age, gender, address) VALUES (?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getNid());
    ps.setString(2, object.getFirstName());
    ps.setString(3, object.getLastName());
    ps.setInt(4, object.getAge());
    ps.setBoolean(5, object.getGender());
    ps.setString(6, object.getAddr());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int update(Patient object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "UPDATE patient SET first_name = ?, last_name = ?, age = ?, gender = ?, address = ? WHERE pid = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getFirstName());
    ps.setString(2, object.getLastName());
    ps.setInt(3, object.getAge());
    ps.setBoolean(4, object.getGender());
    ps.setString(5, object.getAddr());
    ps.setString(6, object.getPid());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int delete(String id) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM patient WHERE pid = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, id);

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
