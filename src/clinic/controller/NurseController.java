package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Nurse;
import java.sql.SQLException;
import java.util.*;

public class NurseController {
  private Dao<Nurse> nurseDao = new NurseDaoImpl();
  
  // Show infomation for search name
  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = nurseDao.getList(name);
    return data;
  }
  
  // Show fullist
  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = nurseDao.getList();
    return data;
  }
  
  // Add data
  public int insertRecord(String firstName, String lastName, String position) throws SQLException {
    Nurse model = new Nurse(null, firstName, lastName, position);
    int result = nurseDao.insert(model);
    return result;
  }

  // Update data 
  public int updateRecord(String id, String firstName, String lastName, String position)
      throws SQLException {
    Nurse model = new Nurse(id, firstName, lastName, position);
    int result = nurseDao.update(model);
    return result;
  }
  
  // Delete data
  public int deleteRecord(String id) throws SQLException {
    int result = nurseDao.delete(id);
    return result;
  }
}
