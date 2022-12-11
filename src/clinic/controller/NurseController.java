package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Nurse;
import java.sql.SQLException;
import java.util.*;

public class NurseController {
  private Dao<Nurse> nurseDao = new NurseDaoImpl();

  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = nurseDao.getList(name);
    return data;
  }

  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = nurseDao.getList();
    return data;
  }

  public int insertRecord(String firstName, String lastName, String position) throws SQLException {
    Nurse model = new Nurse(null, firstName, lastName, position);
    int result = nurseDao.insert(model);
    return result;
  }

  public int updateRecord(String id, String firstName, String lastName, String position)
      throws SQLException {
    Nurse model = new Nurse(id, firstName, lastName, position);
    int result = nurseDao.update(model);
    return result;
  }

  public int deleteRecord(String id) throws SQLException {
    int result = nurseDao.delete(id);
    return result;
  }
}
