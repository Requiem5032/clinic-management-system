package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Patient;
import clinic.view.PatientView;
import java.sql.SQLException;

public class PatientController {
  private Patient model = null;
  private PatientView view = new PatientView();
  private Dao<Patient> patientDao = new PatientDaoImpl();

  public void showRecord(String id) throws SQLException {
    view.getInfo(id);
  }

  public void showList() throws SQLException {
    view.getList();
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
