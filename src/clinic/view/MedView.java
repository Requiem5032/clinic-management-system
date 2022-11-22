package clinic.view;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Med;
import java.sql.SQLException;
import java.util.*;

public class MedView {
  private Dao<Med> medDao = new MedDaoImpl();

  private void printInfo(Med medObj) {
    System.out.print("ID: " + medObj.getID());
    System.out.print(", Name: " + medObj.getName());
    System.out.print(", Price: " + medObj.getPrice() + "$");
    System.out.print(", Quantity: " + medObj.getQuantity() + " Box(es)");
  }

  public void getInfo(String id) throws SQLException {
    Med medObj = medDao.get(id);

    printInfo(medObj);
  }

  public void getList() throws SQLException {
    List<Med> medList = medDao.getAll();

    for (Med medObj : medList) {
      printInfo(medObj);
      System.out.println();
    }
  }
}
