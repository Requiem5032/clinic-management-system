package clinic.DAO;

import clinic.models.Med;
import java.sql.SQLException;
import java.util.*;

public interface MedDAO {
  Med get(String id) throws SQLException;

  List<Med> getAll() throws SQLException;

  int insert(Med object) throws SQLException;

  int delete(Med object) throws SQLException;
}
