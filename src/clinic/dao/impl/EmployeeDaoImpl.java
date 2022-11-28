package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Employee;
import java.sql.*;
import java.util.*;

public class EmployeeDaoImpl implements Dao<Employee> {
  Connection con;

  @Override
  public Employee get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Employee doc = null;
    String query = "SELECT * FROM  `clinic`.`employee` WHERE `id` = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String employeeID = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");

      doc = new Employee(employeeID, firstName, lastName);
    }

    return doc;
  }

  @Override
  public List<Employee> getAll() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM `clinic`.`employee`";
    
    List<Employee> empList = new ArrayList<>();

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while(rs.next()) {
      String id = rs.getString("id");
      String firstName = rs.getString("first_name");
      String lastName = rs.getString("last_name");

      Employee empObj = new Employee(id, firstName, lastName);

      empList.add(empObj);
    }

    return empList;
  }

  @Override
  public int insert(Employee object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "INSERT INTO `clinic`.`employee` (`id`, `first_name`, `last_name`) VALUES (?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getID());
    ps.setString(2, object.getFirstName());
    ps.setString(3, object.getLastName());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int update(Employee object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "UPDATE `clinic`.`employee` SET `first_name` = ?, `last_name` = ? WHERE `id` = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getFirstName());
    ps.setString(2, object.getLastName());
    ps.setString(3, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
  
  @Override
  public int delete(Employee object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM `clinic`.`employee` WHERE `id` = ?";
    
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
