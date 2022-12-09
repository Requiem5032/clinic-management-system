package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Med;
import java.sql.*;
import java.util.*;

public class MedDaoImpl implements Dao<Med> {
  private Connection con;

  @Override
  public List<Med> get(String name) throws SQLException {
    con = DBConnection.createDBConnection();
    Med model = null;
    String query = "SELECT * FROM medicine WHERE name REGEXP  ?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, ".*" + name + ".*");
    ResultSet rs = ps.executeQuery();

    int row = rs.getRow();
    List<Med> objectList = new ArrayList<Med>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String medName = rs.getString("name");
      double price = rs.getDouble("price");
      int quantity = rs.getInt("quantity");

      model = new Med(id, medName, price, quantity);
      objectList.add(model);
    }

    return objectList;
  }

  @Override
  public List<Med> get() throws SQLException {
    con = DBConnection.createDBConnection();
    Med model = null;

    String query = "SELECT * FROM medicine";

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    int row = rs.getRow();

    List<Med> objectList = new ArrayList<Med>(row);

    while (rs.next()) {
      String medId = rs.getString("id");
      String name = rs.getString("name");
      double price = rs.getDouble("price");
      int quantity = rs.getInt("quantity");

      model = new Med(medId, name, price, quantity);
      objectList.add(model);
    }

    return objectList;
  }

  @Override
  public List<List<String>> getList(String name) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM medicine WHERE name REGEXP ?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, ".*" + name + ".*");
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rsmd = rs.getMetaData();

    int row = rs.getRow();
    int col = rsmd.getColumnCount();
    List<List<String>> objectList = new ArrayList<List<String>>(row);

    while (rs.next()) {
      String id = rs.getString("id");
      String medName = rs.getString("name");
      String price = rs.getString("price");
      String quantity = rs.getString("quantity");

      List<String> temp = new ArrayList<String>(col);
      temp.add(id);
      temp.add(medName);
      temp.add(price);
      temp.add(quantity);
      objectList.add(temp);
    }

    return objectList;
  }

  @Override
  public List<List<String>> getList() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM medicine";

    Statement stmt = con.createStatement();

    ResultSet rs = stmt.executeQuery(query);
    ResultSetMetaData rsmd = rs.getMetaData();

    int row = rs.getRow();
    int col = rsmd.getColumnCount();

    List<List<String>> objectList = new ArrayList<List<String>>(row);

    while (rs.next()) {
      String medId = rs.getString("id");
      String name = rs.getString("name");
      double tempPrice = rs.getDouble("price");
      int tempQuantity = rs.getInt("quantity");
      String price = Double.toString(tempPrice);
      String quantity = Integer.toString(tempQuantity);

      List<String> temp = new ArrayList<String>(col);
      temp.add(medId);
      temp.add(name);
      temp.add(price);
      temp.add(quantity);
      objectList.add(temp);
    }

    return objectList;
  }

  @Override
  public int insert(Med object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "INSERT INTO medicine (name, price, quantity) VALUES (?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getName());
    ps.setDouble(2, object.getPrice());
    ps.setInt(3, object.getQuantity());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int update(Med object) throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "UPDATE medicine SET name = ?, price = ?, quantity = ? WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getName());
    ps.setDouble(2, object.getPrice());
    ps.setInt(3, object.getQuantity());
    ps.setString(4, object.getId());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }

  @Override
  public int delete(String id) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM medicine WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, id);

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
