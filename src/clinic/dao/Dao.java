package clinic.dao;

import java.sql.SQLException;
import java.util.*;

public interface Dao<T> {

  /** Get records, which meet the name requirement from database */
  List<T> get(String name) throws SQLException;
  
  /** Get all records from database */
  List<T> get() throws SQLException;
  
  /** Get records, which meet the name requirement from database */
  List<List<String>> getList(String name) throws SQLException;
  
  /** Get all records from database */
  List<List<String>> getList() throws SQLException;
  
  /** Insert a record to database */
  int insert(T object) throws SQLException;
  
  /** Update a record in database */
  int update(T object) throws SQLException;
  
  /** Delete a record from database */
  int delete(String id) throws SQLException;
}
