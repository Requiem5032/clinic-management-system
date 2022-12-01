package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Doctor;
import java.sql.SQLException;
import java.util.*;

public class DoctorController {
  private Doctor model = null;
  private Dao<Doctor> doctorDao = new DoctorDaoImpl();

  public ArrayList<String> getRecord(String id) throws SQLException {
    ArrayList<String> data = doctorDao.getArrayList(id);
    return data;
  }

  public ArrayList<ArrayList<String>> getList() throws SQLException {
    ArrayList<ArrayList<String>> data = doctorDao.getAll();
    return data;
  }

  public void insertRecord(String id, String firstName, String lastName, String position) throws SQLException{
    model = new Doctor(id, firstName, lastName, position);

    int result = doctorDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String id, String firstName, String lastName, String position) throws SQLException{
    model = new Doctor(id, firstName, lastName, position);

    int result = doctorDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException{
    model = doctorDao.get(id);

    int result = doctorDao.delete(model);

    System.out.println(result);
  }
}
