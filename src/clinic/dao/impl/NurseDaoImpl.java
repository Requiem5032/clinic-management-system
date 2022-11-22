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
    Nurse nurse = null;
    String query = "SELECT * FROM  `clinic`.`nurse` WHERE `id` = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String nurseID = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      nurse = new Nurse(nurseID, firstName, lastName, position);
    }

    return nurse;
  }

  @Override
  public List<Nurse> getAll() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM `clinic`.`nurse`";
    
    List<Nurse> nurse = new ArrayList<>();

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while(rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      Nurse nurseObj = new Nurse(id, firstName, lastName, position);

      nurse.add(nurseObj);
    }

    return nurse;
  }

  @Override
  public int insert(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "INSERT INTO `clinic`.`nurse` (`id`, `first_name`, `last_name`, `position`) VALUES (?, ?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getID());
    ps.setString(2, object.getFirstName());
    ps.setString(3, object.getLastName());
    ps.setString(4, object.getPosition());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
  
  @Override
  public int delete(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM `clinic`.`nurse` WHERE `id` = ?";
    
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
