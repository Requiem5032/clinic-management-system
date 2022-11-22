package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Patient;
import java.sql.*;
import java.util.*;

public class PatientDaoImpl implements Dao<Patient> {
  Connection con;

  @Override
  public Patient get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Patient patient = null;

    String query = "SELECT * FROM `clinic`.`patient` WHERE `id` = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String PID = rs.getString("pid");
      String NID = rs.getString("nid");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      int age = rs.getInt("age");
      boolean gender = rs.getBoolean("gender");
      String addr = rs.getString("address");

      patient = new Patient(PID, NID, firstName, lastName, age, gender, addr);
    }

    return patient;
  }

  @Override
  public List<Patient> getAll() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM `clinic`.`patient`";
    
    List<Patient> patient = new ArrayList<>();

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while(rs.next()) {
      String PID = rs.getString("pid");
      String NID = rs.getString("nid");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      int age = rs.getInt("age");
      boolean gender = rs.getBoolean("gender");
      String addr = rs.getString("address");

      Patient patientObj = new Patient(PID, NID, firstName, lastName, age, gender, addr);

      patient.add(patientObj);
    }

    return patient;
  }

  @Override
  public int insert(Patient object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "INSERT INTO `clinic`.`patient` (`pid`, `nid`, `first_name`, `last_name`, `age`, `gender`, `address`) VALUES (?, ?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getPID());
    ps.setString(2, object.getNID());
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
  public int delete(Patient object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM `clinic`.`patient` WHERE `id` = ?";
    
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getPID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}