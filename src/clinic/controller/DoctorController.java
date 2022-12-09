package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Doctor;
import java.sql.SQLException;
import java.util.*;

public class DoctorController {
  private Dao<Doctor> doctorDao = new DoctorDaoImpl();

  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = doctorDao.getList(name);
    return data;
  }

  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = doctorDao.getList();
    return data;
  }

  public void insertRecord(String firstName, String lastName, String position) throws SQLException {
    Doctor model = new Doctor(null, firstName, lastName, position);

    int result = doctorDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String id, String firstName, String lastName, String position) throws SQLException {
    Doctor model = new Doctor(id, firstName, lastName, position);

    int result = doctorDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException {
    int result = doctorDao.delete(id);

    System.out.println(result);
  }
}
