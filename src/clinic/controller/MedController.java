package clinic.controller;

import clinic.dao.*;
import clinic.dao.impl.*;
import clinic.model.Med;
import clinic.view.MedView;
import java.sql.SQLException;

public class MedController {
  private Med model = null;
  private MedView view = new MedView();
  private Dao<Med> medDao = new MedDaoImpl();

  public void insertRecord(String id, String name, double price, int quantity) throws SQLException{
    model = new Med(id, name, price, quantity);

    int result = medDao.insert(model);

    System.out.println(result);
  }

  public void deleteRecord(String id) throws SQLException{
    model = medDao.get(id);

    int result = medDao.delete(model);

    System.out.println(result);
  }

  public void showRecord(String id) throws SQLException {
    view.getInfo(id);
  }

  public void showList() throws SQLException {
    view.getList();
  }
}
