package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Nurse;
import clinic.view.NurseView;
import java.sql.SQLException;

public class NurseController {
  private Nurse model = null;
  private NurseView view = new NurseView();
  private Dao<Nurse> nurseDao = new NurseDaoImpl();
  
  public void showRecord(String id) throws SQLException {
    view.getInfo(id);
  }

  public void showList() throws SQLException {
    view.getList();
  }

  public void insertRecord(String id, String firstName, String lastName, String position) throws SQLException{
    model = new Nurse(id, firstName, lastName, position);

    int result = nurseDao.insert(model);

    System.out.println(result);
  }

  public void updateRecord(String id, String firstName, String lastName, String position) throws SQLException{
    model = new Nurse(id, firstName, lastName, position);

    int result = nurseDao.update(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException{
    model = nurseDao.get(id);

    int result = nurseDao.delete(model);

    System.out.println(result);
  }
}
