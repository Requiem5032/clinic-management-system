package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Med;
import java.sql.SQLException;
import java.util.*;

public class MedController {
  private Dao<Med> medDao = new MedDaoImpl();
  
  /** Get information from name */
  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = medDao.getList(name);
    return data;
  }
  
  /** Get information from all records */
  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = medDao.getList();
    return data;
  }
  
  /** Add record */
  public int insertRecord(String name, double price, int quantity) throws SQLException {
    Med model = new Med(null, name, price, quantity);
    int result = medDao.insert(model);
    return result;
  }
  
  /** Update record */
  public int updateRecord(String id, String name, double price, int quantity) throws SQLException {
    Med model = new Med(id, name, price, quantity);
    int result = medDao.update(model);
    return result;
  }
  
  /** Delete record */
  public int deleteRecord(String id) throws SQLException {
    int result = medDao.delete(id);
    return result;
  }
}
