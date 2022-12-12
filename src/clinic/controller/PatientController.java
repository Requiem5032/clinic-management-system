package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Patient;
import java.sql.SQLException;
import java.util.*;

public class PatientController {
  private Dao<Patient> patientDao = new PatientDaoImpl();
  
  /** Get information from name */
  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = patientDao.getList(name);
    return data;
  }
 
  /** Get information from all records */
  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = patientDao.getList();
    return data;
  }
  
  /** Add record */
  public int insertRecord(String nid, String firstName, String lastName, int age, boolean gender,
      String addr) throws SQLException {
    Patient model = new Patient(null, nid, firstName, lastName, age, gender, addr);
    int result = patientDao.insert(model);
    return result;
  }
  
  /** Update record */
  public int updateRecord(String pid, String firstName, String lastName, int age, boolean gender,
      String addr) throws SQLException {
    Patient model = new Patient(pid, null, firstName, lastName, age, gender, addr);
    int result = patientDao.update(model);
    return result;
  }
  
  /** Delete record */
  public int deleteRecord(String id) throws SQLException {
    int result = patientDao.delete(id);
    return result;
  }
}
