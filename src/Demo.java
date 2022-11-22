import clinic.dao.*;
import clinic.daoimpl.*;
import clinic.models.*;
import java.util.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    List<Doctor> doctorList;

    Dao<Doctor> doctorDAO = new DoctorDaoImpl();

    doctorList = doctorDAO.getAll();

    for (Doctor doctorObj : doctorList) {
      doctorObj.printInfo();
    }
  }
}
