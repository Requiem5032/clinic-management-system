import clinic.dao.*;
import clinic.model.*;
import java.util.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    List<Doctor> doctorList;

    Dao<Doctor> doctorDao = new DoctorDaoImpl();

    doctorList = doctorDao.getAll();

    for (Doctor doctorObj : doctorList) {
      doctorObj.printInfo();
      System.out.println();
    }

    System.out.println();

    Doctor d1 = doctorDao.get("D035157");

    d1.printInfo();
  }
}
