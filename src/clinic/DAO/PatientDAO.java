package clinic.DAO;

import clinic.models.Patient;
import java.sql.SQLException;
import java.util.*;

public interface PatientDAO {
  Patient get(String id) throws SQLException;

  List<Patient> getAll() throws SQLException;

  int insert(Patient object) throws SQLException;

  int delete(Patient object) throws SQLException;
}
