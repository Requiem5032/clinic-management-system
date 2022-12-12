package clinic.dao;

import java.sql.SQLException;
import java.util.*;

public interface Dao<T> {

  // Get one record from database
  List<T> get(String name) throws SQLException;
  
  // Get all record from database
  List<T> get() throws SQLException;
  
  // Get one record from database as a list of string
  List<List<String>> getList(String name) throws SQLException;
  
  // Get all record from database as a list of list of string
  List<List<String>> getList() throws SQLException;
  
  // Insert an object to database
  int insert(T object) throws SQLException;
  
  // Update an object in database
  int update(T object) throws SQLException;
  
  // Delete an object from database
  int delete(String id) throws SQLException;
}
