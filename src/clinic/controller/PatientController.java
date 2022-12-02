package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Patient;
import java.sql.SQLException;
import java.util.*;

public class PatientController {
  private Patient model = null;
  private Dao<Patient> patientDao = new PatientDaoImpl();

  public ArrayList<String> getRecord(String id) throws SQLException {
    ArrayList<String> data = patientDao.getArrayList(id);
    return data;
  }

  public ArrayList<ArrayList<String>> getRecord() throws SQLException {
    ArrayList<ArrayList<String>> data = patientDao.getAll();
    return data;
  }

  public void insertRecord(String pid, String nid, String firstName, String lastName, int age,
      boolean gender, String addr) throws SQLException {
    model = new Patient(pid, nid, firstName, lastName, age, gender, addr);

    int result = patientDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String pid, String nid, String firstName, String lastName, int age,
      boolean gender, String addr) throws SQLException {
    model = new Patient(pid, nid, firstName, lastName, age, gender, addr);

    int result = patientDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException {
    model = patientDao.get(id);

    int result = patientDao.delete(model);

    System.out.println(result);
  }
}
