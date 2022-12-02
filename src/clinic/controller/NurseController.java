package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Nurse;
import java.sql.SQLException;
import java.util.*;

public class NurseController {
  private Nurse model = null;
  private Dao<Nurse> nurseDao = new NurseDaoImpl();

  public ArrayList<String> getRecord(String id) throws SQLException {
    ArrayList<String> data = nurseDao.getArrayList(id);
    return data;
  }

  public ArrayList<ArrayList<String>> getRecord() throws SQLException {
    ArrayList<ArrayList<String>> data = nurseDao.getAll();
    return data;
  }

  public void insertRecord(String id, String firstName, String lastName, String position) throws SQLException{
    model = new Nurse(id, firstName, lastName, position);

    int result = nurseDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String id, String firstName, String lastName, String position) throws SQLException{
    model = new Nurse(id, firstName, lastName, position);

    int result = nurseDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException{
    model = nurseDao.get(id);

    int result = nurseDao.delete(model);

    System.out.println(result);
  }
}
