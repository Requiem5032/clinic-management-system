package clinic.DAO;

import java.sql.SQLException;
import java.util.*;

public interface EmployeeDAO<T> {
  T get(String id) throws SQLException;

  List<T> getAll() throws SQLException;

  int insert(T object) throws SQLException;

  int delete(T object) throws SQLException;
}
