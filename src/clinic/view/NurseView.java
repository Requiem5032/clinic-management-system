package clinic.view;

import clinic.dao.*;
import clinic.dao.impl.NurseDaoImpl;
import clinic.model.Nurse;
import java.sql.SQLException;
import java.util.*;

public class NurseView {
  private Dao<Nurse> nurseDao = new NurseDaoImpl();

  private void printInfo(Nurse nurseObj) {
    System.out.println("ID: " + nurseObj.getID());
    System.out.println("First name: " + nurseObj.getFirstName());
    System.out.println("Last name: " + nurseObj.getLastName());
    System.out.println("Position: " + nurseObj.getPosition());
  }

  public void getInfo(String id) throws SQLException {
    Nurse nurseObj = nurseDao.get(id);

    printInfo(nurseObj);
  }

  public void getList() throws SQLException {
    List<Nurse> nurseList = nurseDao.getAll();

    for (Nurse nurseObj : nurseList) {
      printInfo(nurseObj);
      System.out.println();
    }
  }
}
