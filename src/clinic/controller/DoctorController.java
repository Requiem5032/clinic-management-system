package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Doctor;
import clinic.view.DoctorView;
import java.sql.SQLException;

public class DoctorController {
  private Doctor model = null;
  private DoctorView view = new DoctorView();
  private Dao<Doctor> doctorDao = new DoctorDaoImpl();

  public void insertRecord(String id, String firstName, String lastName, String position) throws SQLException{
    model = new Doctor(id, firstName, lastName, position);

    int result = doctorDao.insert(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException{
    model = doctorDao.get(id);

    int result = doctorDao.delete(model);

    System.out.println(result);
  }

  public void showRecord(String id) throws SQLException {
    view.getInfo(id);
  }

  public void showList() throws SQLException {
    view.getList();
  }
}
