import clinic.controller.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    DoctorController doctorCtrl = new DoctorController();
    MedController medCtrl = new MedController();
    NurseController nurseCtrl = new NurseController();
    PatientController patientCtrl = new PatientController();

    doctorCtrl.showList();
    medCtrl.showList();
    nurseCtrl.showList();
    patientCtrl.showList();
  }
}
