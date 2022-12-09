package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Med;
import java.sql.SQLException;
import java.util.*;

public class MedController {
  private Dao<Med> medDao = new MedDaoImpl();

  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = medDao.getList(name);
    return data;
  }

  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = medDao.getList();
    return data;
  }

  public void insertRecord(String name, double price, int quantity) throws SQLException {
    Med model = new Med(null, name, price, quantity);

    int result = medDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String id, String name, double price, int quantity) throws SQLException {
    Med model = new Med(id, name, price, quantity);

    int result = medDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException {
    int result = medDao.delete(id);

    System.out.println(result);
  }
}
