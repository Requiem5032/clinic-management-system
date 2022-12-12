package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Patient;
import java.sql.SQLException;
import java.util.*;

public class PatientController {
  private Dao<Patient> patientDao = new PatientDaoImpl();
  
  // Show infomation for search name
  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = patientDao.getList(name);
    return data;
  }
 
  // Show fullist
  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = patientDao.getList();
    return data;
  }
  
  // Add data
  public int insertRecord(String nid, String firstName, String lastName, int age, boolean gender,
      String addr) throws SQLException {
    Patient model = new Patient(null, nid, firstName, lastName, age, gender, addr);
    int result = patientDao.insert(model);
    return result;
  }
  
  // Update data 
  public int updateRecord(String pid, String firstName, String lastName, int age, boolean gender,
      String addr) throws SQLException {
    Patient model = new Patient(pid, null, firstName, lastName, age, gender, addr);
    int result = patientDao.update(model);
    return result;
  }
  
  // Delete data
  public int deleteRecord(String id) throws SQLException {
    int result = patientDao.delete(id);
    return result;
  }
}
