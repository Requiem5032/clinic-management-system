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
    Nurse nur = null;
    String query =
        "SELECT `employee`.`id`, `employee`.`first_name`, `employee`.`last_name`, `nurse`.`position` FROM ``nurse` INNER JOIN ``employee` ON `employee`.`id` = `nurse`.`id` WHERE `employee`.`id` = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String nurseID = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      nur = new Nurse(nurseID, firstName, lastName, position);
    }

    return nur;
  }

  @Override
  public List<Nurse> getAll() throws SQLException {
    con = DBConnection.createDBConnection();
    String query =
        "SELECT `employee`.`id`, `employee`.`first_name`, `employee`.`last_name`, `nurse`.`position` FROM ``nurse` INNER JOIN ``employee` ON `employee`.`id` = `nurse`.`id`";

    List<Nurse> nurList = new ArrayList<>();

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while (rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      Nurse nurObj = new Nurse(id, firstName, lastName, position);

      nurList.add(nurObj);
    }

    return nurList;
  }

  @Override
  public int insert(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query =
        "INSERT INTO ``employee` (`id`, `first_name`, `last_name`) VALUE (?, ?, ?); INSERT INTO ``nurse` (`id`, `position`) VALUES (?, ?)";

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
  public int update(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "UPDATE ``nurse` SET `position` = ? WHERE `id` = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getPosition());
    ps.setString(2, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int delete(Nurse object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query =
        "DELETE FROM `employee`, `nurse` USING `employee` INNER JOIN `nurse` ON `nurse`.`id` = `employee`.`id` WHERE `employee`.`id` = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getID());
    ps.setString(2, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
