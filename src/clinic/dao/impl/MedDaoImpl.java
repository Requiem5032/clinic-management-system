package clinic.dao.impl;

import clinic.connection.DBConnection;
import clinic.dao.Dao;
import clinic.model.Med;
import java.sql.*;
import java.util.*;

public class MedDaoImpl implements Dao<Med> {
  Connection con;

  @Override
  public Med get(String id) throws SQLException {
    con = DBConnection.createDBConnection();
    Med model = null;

    String query = "SELECT * FROM medicine WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, id);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
      String medId = rs.getString("id");
      String name = rs.getString("name");
      double price = rs.getDouble("price");
      int quantity = rs.getInt("quantity");

      model = new Med(medId, name, price, quantity);
    }

    return model;
  }

  @Override
  public List<Med> get() throws SQLException {
    con = DBConnection.createDBConnection();
    Med model = null;

    String query = "SELECT * FROM medicine ORDER BY id ASC";

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
  public List<String> getList(String id) throws SQLException {
    Med model = get(id);
    List<String> data = new ArrayList<String>();
    data.add(model.getId());
    data.add(model.getName());
    double tempPrice = model.getPrice();
    data.add(Double.toString(tempPrice));
    int tempQuantity = model.getQuantity();
    data.add(Integer.toString(tempQuantity));

    return data;
  }

  @Override
  public List<List<String>> getList() throws SQLException {
    con = DBConnection.createDBConnection();
    String query = "SELECT * FROM medicine ORDER BY id ASC";

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
    String query = "INSERT INTO medicine (id, name, price, quantity) VALUES (?, ?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, object.getId());
    ps.setString(2, object.getName());
    ps.setDouble(3, object.getPrice());
    ps.setInt(4, object.getQuantity());

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
  public int delete(Med object) throws SQLException {
    con = DBConnection.createDBConnection();

    String query = "DELETE FROM medicine WHERE id = ?";

    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, object.getId());

    int result = ps.executeUpdate();

    DBConnection.closePreparedStatement(ps);
    DBConnection.closeConnection(con);

    return result;
  }
}
