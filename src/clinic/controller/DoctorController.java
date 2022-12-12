package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Doctor;
import java.sql.SQLException;
import java.util.*;

public class DoctorController {
  private Dao<Doctor> doctorDao = new DoctorDaoImpl();

  /** Get information from name */
  public List<List<String>> getRecord(String name) throws SQLException {
    List<List<String>> data = doctorDao.getList(name);
    return data;
  }

  /** Get information from all records */
  public List<List<String>> getRecord() throws SQLException {
    List<List<String>> data = doctorDao.getList();
    return data;
  }

  /** Add record */
  public int insertRecord(String firstName, String lastName, String position) throws SQLException {
    Doctor model = new Doctor(null, firstName, lastName, position);
    int result = doctorDao.insert(model);
    return result;
  }

  /** Update record */
  public int updateRecord(String id, String firstName, String lastName, String position)
      throws SQLException {
    Doctor model = new Doctor(id, firstName, lastName, position);
    int result = doctorDao.update(model);
    return result;
  }

  /** Delete record */
  public int deleteRecord(String id) throws SQLException {
    int result = doctorDao.delete(id);
    return result;
  }
}
