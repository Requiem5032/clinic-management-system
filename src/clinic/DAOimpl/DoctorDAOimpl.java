package clinic.DAOimpl;

import clinic.connection.DBConnection;
import clinic.DAO.EmployeeDAO;
import clinic.models.Doctor;
import java.sql.*;
import java.util.*;

public class DoctorDAOimpl implements EmployeeDAO<Doctor> {
  Connection con;

  @Override
  public Doctor get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Doctor doc = null;
    String query = "SELECT * FROM  `clinic`.`doctor` WHERE `id` = ?";

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
  public List<Doctor> getAll() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM `clinic`.`doctor`";
    
    List<Doctor> docList = new ArrayList<>();

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while(rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");
      String position = rs.getString("position");

      Doctor docObj = new Doctor(id, firstName, lastName, position);

      docList.add(docObj);
    }

    return docList;
  }

  @Override
  public int insert(Doctor object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "INSERT INTO `clinic`.`doctor` (`id`, `first_name`, `last_name`, `position`) VALUES (?, ?, ?, ?)";

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
  public int delete(Doctor object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM `clinic`.`doctor` WHERE `id` = ?";
    
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
