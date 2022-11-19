import clinic.DAO.*;
import clinic.DAOimpl.*;
import clinic.models.*;
import java.util.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    List<Patient> patientList;
    List<Doctor> doctorList;
    List<Nurse> nurseList;
    List<Med> medList;

    PatientDAO patientDAO = new PatientDAOimpl();
    EmployeeDAO<Doctor> doctorDAO = new DoctorDAOimpl();
    EmployeeDAO<Nurse> nurseDAO = new NurseDAOimpl();
    MedDAO medDAO = new MedDAOimpl();

    patientList = patientDAO.getAll();
    doctorList = doctorDAO.getAll();
    nurseList = nurseDAO.getAll();
    medList = medDAO.getAll();

    System.out.println("Patient list: ");
    for (Patient patient : patientList) {
      patient.printInfo();
      System.out.println();
    }

    System.out.println("Doctor list: ");
    for (Doctor doctor : doctorList) {
      doctor.printInfo();
      System.out.println();
    }

    System.out.println("Nurse list: ");
    for (Nurse nurse : nurseList) {
      nurse.printInfo();
      System.out.println();
    }

    System.out.println("Medicine list: ");
    for (Med med : medList) {
      med.printInfo();
      System.out.println();
    }
  }
}
