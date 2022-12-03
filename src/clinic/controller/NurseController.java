package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Nurse;
import java.sql.SQLException;
import java.util.*;

public class NurseController {
  private Nurse model = null;
  private Dao<Nurse> nurseDao = new NurseDaoImpl();

  public List<String> getRecord(String id) throws SQLException {
    List<String> data = nurseDao.getList(id);
    return data;
  }

  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = nurseDao.getList();
    return data;
  }

  public void insertRecord(String id, String firstName, String lastName, String position)
      throws SQLException {
    model = new Nurse(id, firstName, lastName, position);

    int result = nurseDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String id, String firstName, String lastName, String position)
      throws SQLException {
    model = new Nurse(id, firstName, lastName, position);

    int result = nurseDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException {
    model = nurseDao.get(id);

    int result = nurseDao.delete(model);

    System.out.println(result);
  }
}
