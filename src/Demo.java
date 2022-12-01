import clinic.controller.*;
import clinic.view.doctor.*;
public class Demo {
  public static void main(String[] args) throws Exception {
    DoctorController doctorCtrl = new DoctorController();
    NurseController nurseCtrl = new NurseController();
    MedController medCtrl = new MedController();
    PatientController patientCtrl = new PatientController();

    // Add addData = new Add();
    // addData.setVisible(true);

    ShowList retrieveList = new ShowList();
    retrieveList.setVisible(true);

    // doctorCtrl.insertRecord("test", "test", "test", "test");
    // nurseCtrl.insertRecord("null", "null", "null", "null");
    // medCtrl.insertRecord("null", "null", 0, 0);
    // patientCtrl.insertRecord("null", "null", "null", "null", 0, false, "null");

    // doctorCtrl.deleteRecord("1");
    // nurseCtrl.deleteRecord("null");
    // medCtrl.deleteRecord("null");
    // patientCtrl.deleteRecord("null");

    // doctorCtrl.updateRecord("test", "null", "null", "null");
    // nurseCtrl.updateRecord("null", "1", "1", "1");
    // medCtrl.updateRecord("null", "1", 3.2, 120);
    // patientCtrl.updateRecord("null", "1", "1", "1", 20, true, "1");

    // doctorCtrl.showList();
    // nurseCtrl.showList();
    // medCtrl.showList();
    // patientCtrl.showList();
  }
}
