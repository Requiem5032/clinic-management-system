package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Patient;
import java.sql.SQLException;
import java.util.*;

public class PatientController {
  private Patient model = null;
  private Dao<Patient> patientDao = new PatientDaoImpl();

  public List<String> getRecord(String id) throws SQLException {
    List<String> data = patientDao.getList(id);
    return data;
  }

  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = patientDao.getList();
    return data;
  }

  public void insertRecord(String pid, String nid, String firstName, String lastName, int age,
      boolean gender, String addr) throws SQLException {
    model = new Patient(pid, nid, firstName, lastName, age, gender, addr);

    int result = patientDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String pid, String firstName, String lastName, int age,
      boolean gender, String addr) throws SQLException {
    model = new Patient(pid, null, firstName, lastName, age, gender, addr);

    int result = patientDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException {
    model = patientDao.get(id);

    int result = patientDao.delete(model);

    System.out.println(result);
  }
}
