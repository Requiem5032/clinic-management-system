package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Med;
import java.sql.SQLException;
import java.util.*;

public class MedController {
  private Med model = null;
  private Dao<Med> medDao = new MedDaoImpl();

  public List<String> getRecord(String id) throws SQLException {
    List<String> data = medDao.getList(id);
    return data;
  }

  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = medDao.getList();
    return data;
  }

  public void insertRecord(String id, String name, double price, int quantity) throws SQLException {
    model = new Med(id, name, price, quantity);

    int result = medDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String id, String name, double price, int quantity) throws SQLException {
    model = new Med(id, name, price, quantity);

    int result = medDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException {
    model = medDao.get(id);

    int result = medDao.delete(model);

    System.out.println(result);
  }
}
