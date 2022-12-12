package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Nurse;
import java.sql.SQLException;
import java.util.*;

public class NurseController {
  private Dao<Nurse> nurseDao = new NurseDaoImpl();

  /** Get information from name */
  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = nurseDao.getList(name);
    return data;
  }

  /** Get information from all records */
  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = nurseDao.getList();
    return data;
  }

  /** Add record */
  public int insertRecord(String firstName, String lastName, String position) throws SQLException {
    Nurse model = new Nurse(null, firstName, lastName, position);
    int result = nurseDao.insert(model);
    return result;
  }

  /** Update record */
  public int updateRecord(String id, String firstName, String lastName, String position)
      throws SQLException {
    Nurse model = new Nurse(id, firstName, lastName, position);
    int result = nurseDao.update(model);
    return result;
  }

  /** Delete record */
  public int deleteRecord(String id) throws SQLException {
    int result = nurseDao.delete(id);
    return result;
  }
}
