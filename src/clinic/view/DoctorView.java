package clinic.view;

import clinic.dao.*;
import clinic.dao.impl.DoctorDaoImpl;
import clinic.model.Doctor;
import java.sql.SQLException;
import java.util.*;

public class DoctorView {
  private Dao<Doctor> doctorDao = new DoctorDaoImpl();

  private void printInfo(Doctor doctorObj) {
    System.out.println("ID: " + doctorObj.getID());
    System.out.println("First name: " + doctorObj.getFirstName());
    System.out.println("Last name: " + doctorObj.getLastName());
    System.out.println("Position: " + doctorObj.getPosition());
  }

  public void getInfo(String id) throws SQLException {
    Doctor doctorObj = doctorDao.get(id);

    printInfo(doctorObj);
  }

  public void getList() throws SQLException {
    List<Doctor> doctorList = doctorDao.getAll();

    for (Doctor doctorObj : doctorList) {
      printInfo(doctorObj);
      System.out.println();
    }
  }
}
