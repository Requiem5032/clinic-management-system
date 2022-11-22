package clinic.view;

import clinic.dao.*;
import clinic.dao.impl.PatientDaoImpl;
import clinic.model.Patient;
import java.sql.SQLException;
import java.util.*;

public class PatientView {
  private Dao<Patient> patientDao = new PatientDaoImpl();

  private void printInfo(Patient patientObj) {
    System.out.println("Patient ID: " + patientObj.getPid());
    System.out.println("National ID: " + patientObj.getNid());
    System.out.println("First name: " + patientObj.getFirstName());
    System.out.println("Last name: " + patientObj.getLastName());
    System.out.println("Age: " + patientObj.getAge());

    if (patientObj.getGender() == true) {
      System.out.println("Gender: Male");
    }

    else {
      System.out.println("Gender: Female");
    }

    System.out.println("Address: " + patientObj.getAddr());
  }

  public void getInfo(String nid) throws SQLException {
    Patient patientObj = patientDao.get(nid);

    printInfo(patientObj);
  }

  public void getList() throws SQLException {
    List<Patient> patientList = patientDao.getAll();

    for (Patient patientObj : patientList) {
      printInfo(patientObj);
      System.out.println();
    }
  }
}
