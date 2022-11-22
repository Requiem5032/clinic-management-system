package clinic.dao;

import clinic.connection.DBConnection;
import clinic.model.Med;
import java.sql.*;
import java.util.*;

public class MedDaoImpl implements Dao<Med> {
  Connection con;

  @Override
  public Med get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Med med = null;

    String query = "SELECT * FROM `clinic`.`medicine` WHERE `id` = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String medID = rs.getString("id");
      String name = rs.getString("name");
      double price = rs.getDouble("price");
      int quantity = rs.getInt("quantity");

      med = new Med(medID, name, price, quantity);
    }

    return med;
  }
  @Override
  public List<Med> getAll() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM `clinic`.`medicine`";
    
    List<Med> medList = new ArrayList<>();

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while(rs.next()) {
      String medID = rs.getString("id");
      String name = rs.getString("name");
      double price = rs.getDouble("price");
      int quantity = rs.getInt("quantity");

      Med medObj = new Med(medID, name, price, quantity);

      medList.add(medObj);
    }

    return medList;
  }

  @Override
  public int insert(Med object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "INSERT INTO `clinic`.`medicine` (`id`, `name`, `price`, `quantity`) VALUES (?, ?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getID());
    ps.setString(2, object.getName());
    ps.setDouble(3, object.getPrice());
    ps.setInt(4, object.getQuantity());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int delete(Med object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM `clinic`.`medicine` WHERE `id` = ?";
    
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getID());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}