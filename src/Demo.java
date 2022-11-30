import clinic.controller.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    DoctorController doctorCtrl = new DoctorController();
    NurseController nurseCtrl = new NurseController();
    MedController medCtrl = new MedController();
    PatientController patientCtrl = new PatientController();

    // doctorCtrl.insertRecord("test", "test", "test", "test");
    // nurseCtrl.insertRecord("null", "null", "null", "null");
    // medCtrl.insertRecord("null", "null", 0, 0);
    // patientCtrl.insertRecord("null", "null", "null", "null", 0, false, "null");

    doctorCtrl.deleteRecord("test");
    nurseCtrl.deleteRecord("null");
    medCtrl.deleteRecord("null");
    patientCtrl.deleteRecord("null");
  }
}
