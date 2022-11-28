package clinic.dao;

import java.sql.SQLException;
import java.util.*;

public interface Dao<T> {
  T get(String id) throws SQLException;

  List<T> getAll() throws SQLException;

  int insert(T object) throws SQLException;

  int update(T object) throws SQLException;

  int delete(T object) throws SQLException;
}
